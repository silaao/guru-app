package com.application.guru;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Random;

public class VentosActivity extends AppCompatActivity {

    private String[] respostas = {
            "Há um novo começo em seu horizonte.",
            "As estrelas revelam que mudanças significativas estão a caminho.",
            "Um antigo amigo pode ressurgir em sua vida em breve.",
            "Sua jornada está prestes a levar a caminhos inexplorados.",
            "Fique atento a uma oportunidade de negócio que se aproxima.",
            "Uma decisão importante deve ser tomada nos próximos meses.",
            "Uma viagem inesperada pode trazer novas perspectivas.",
            "As energias cósmicas indicam sorte financeira à vista.",
            "Cuidado com uma pessoa invejosa ao seu redor.",
            "Suas habilidades criativas florescerão em breve.",
            "A intuição será sua guia nos desafios que se aproximam.",
            "Sua saúde está ligada ao equilíbrio emocional; cuide-se.",
            "Uma reconciliação está no horizonte para relacionamentos passados.",
            "Um novo mentor ou guia espiritual entrará em sua vida.",
            "O sucesso profissional virá através da persistência.",
            "Uma surpresa agradável aguarda você no próximo mês.",
            "Suas habilidades de comunicação serão vitais em um projeto futuro.",
            "Esteja aberto a novas amizades; elas serão valiosas.",
            "Uma fase de transformação está prestes a começar.",
            "Seus talentos ocultos serão descobertos e apreciados.",
            "Oportunidades para aprendizado e crescimento estão à frente.",
            "Confie na sua intuição ao tomar decisões importantes.",
            "Um evento social será crucial para sua vida amorosa.",
            "Mudanças em casa trarão estabilidade emocional.",
            "Seu trabalho árduo será recompensado mais cedo do que pensa.",
            "A paciência será a chave para superar obstáculos.",
            "Uma nova paixão pode surgir em um ambiente de aprendizado.",
            "Evite conflitos; a paz interior é fundamental.",
            "Novas descobertas espirituais o levarão a uma jornada mais profunda.",
            "Seja grato pelas pequenas bênçãos que a vida oferece.",
            "Sua generosidade será recompensada em dobro.",
            "Mantenha-se fiel aos seus princípios; a recompensa virá.",
            "Este é o momento ideal para iniciar um novo hobby.",
            "Uma figura paterna desempenhará um papel importante em breve.",
            "Cuide de sua saúde mental; momentos desafiadores estão chegando.",
            "Um projeto criativo florescerá além das expectativas.",
            "Uma lição importante será aprendida com um erro passado.",
            "A sorte está do seu lado em assuntos financeiros.",
            "Abra-se para novas perspectivas; a rigidez não o beneficiará.",
            "Sua intuição o guiará através de um período incerto.",
            "Um reencontro com um ente querido está próximo.",
            "Seu carisma atrairá oportunidades inesperadas.",
            "Esteja preparado para uma revelação surpreendente.",
            "Uma amizade antiga se fortalecerá ainda mais.",
            "O sucesso está ligado à sua capacidade de adaptação.",
            "A verdade será revelada, trazendo clareza aos mal-entendidos.",
            "A harmonia familiar será restaurada após um período turbulento.",
            "Uma figura maternal desempenhará um papel vital em sua vida.",
            "Esteja ciente de um colega de trabalho invejoso.",
            "Sua determinação o levará a novas alturas.",
            "Uma viagem ao exterior trará insights transformadores.",
            "Fique atento às oportunidades de networking.",
            "Um novo amor pode surgir de uma amizade existente.",
            "Mantenha-se fiel aos seus valores, mesmo sob pressão.",
            "O universo conspira a seu favor; confie no processo.",
            "Aprenda com as experiências passadas para evitar repetições.",
            "Sua criatividade será a chave para superar desafios.",
            "Uma figura espiritual influenciará positivamente sua jornada.",
            "Aprenda a soltar o que não pode controlar.",
            "Uma mudança de carreira está no horizonte.",
            "Suas habilidades de liderança serão reconhecidas e recompensadas.",
            "Um novo membro da família trará alegria inesperada.",
            "Esteja aberto a conselhos de uma pessoa mais experiente.",
            "A felicidade está intrinsecamente ligada à gratidão.",
            "Uma situação financeira delicada será resolvida com sucesso.",
            "O romance florescerá em um ambiente criativo.",
            "A energia positiva atrairá oportunidades auspiciosas.",
            "Sua intuição o alertará sobre uma decisão crucial.",
            "Uma antiga paixão pode ressurgir; avalie cuidadosamente.",
            "A espiritualidade trará equilíbrio à sua vida.",
            "Mantenha-se focado em seus objetivos; o sucesso está próximo.",
            "A compaixão será fundamental em um momento desafiador.",
            "Uma amizade de longa data será testada; mantenha a calma.",
            "Esteja aberto a uma abordagem mais flexível em relacionamentos.",
            "A sorte está do seu lado em questões financeiras.",
            "A criatividade será a chave para superar desafios emocionais.",
            "Aprenda a soltar o que não serve mais ao seu crescimento.",
            "Uma oportunidade de viagem inesperada trará novas perspectivas.",
            "Esteja aberto a uma abordagem mais espiritual em seu trabalho.",
            "Sua resiliência será testada em uma situação familiar.",
            "Uma amizade duradoura será renovada; aprecie-a.",
            "A compaixão será fundamental em um momento emocionalmente desafiador.",
            "Esteja preparado para uma revelação surpreendente em seu caminho.",
            "Mantenha a calma em meio a desafios profissionais; soluções estão chegando.",
            "Uma oportunidade de investimento lucrativa está a caminho.",
            "Seja grato pelas lições que as dificuldades trazem consigo.",
            "Uma figura paternal desempenhará um papel crucial em seus projetos futuros.",
            "Esteja ciente de uma influência tóxica em seu círculo social.",
            "Seu carisma abrirá portas para oportunidades de networking.",
            "Um segredo revelado pode mudar a dinâmica de um relacionamento existente.",
            "Uma paixão criativa será reacendida; siga sua inspiração.",
            "Mantenha a fé em meio a desafios emocionais; a cura está próxima.",
            "Uma surpresa financeira positiva está a caminho.",
            "Esteja aberto a uma abordagem mais intuitiva em decisões importantes.",
            "Seu otimismo será uma fonte de inspiração para os outros.",
            "Uma antiga rivalidade será resolvida; a paz está próxima.",
            "A energia positiva atrairá oportunidades amorosas.",
            "Uma mudança de residência trará estabilidade emocional.",
            "A intuição feminina será vital em um dilema futuro.",
            "Esteja preparado para uma reviravolta emocional inesperada.",
            "Uma conexão cósmica com um lugar específico trará revelações.",
            "Vejo um encontro inesperado que mudará seu destino.",
            "As cartas revelam um período de crescimento espiritual em sua vida.",
            "Um amor do passado pode ressurgir, trazendo consigo desafios e aprendizados.",
            "Cuidado com decisões impulsivas; a reflexão será crucial.",
            "O caminho à frente é iluminado pela estrela da esperança.",
            "Uma mudança de emprego está no horizonte, trazendo novas oportunidades.",
            "A saúde requer atenção; a prevenção será a chave para a vitalidade.",
            "A influência de uma amizade próxima será vital em momentos difíceis.",
            "Os laços familiares fortalecerão, proporcionando apoio em tempos turbulentos.",
            "A viagem que você planeja será mais do que uma simples jornada física.",
            "Sua intuição será uma guia valiosa nos próximos meses.",
            "O passado está se desdobrando, revelando segredos que podem surpreendê-lo.",
            "Um novo começo se aproxima, trazendo consigo a promessa de renovação.",
            "Cuidado com uma figura sombria que pode tentar prejudicar seu progresso.",
            "A paciência será fundamental enquanto aguarda o desenrolar de eventos importantes.",
            "Uma reconciliação está no horizonte, mas será necessário perdão mútuo.",
            "O dinheiro fluirá mais livremente, mas a moderação será crucial.",
            "Um mentor espiritual surgirá, oferecendo sabedoria e orientação.",
            "A carta do Tarô revela uma revelação surpreendente em breve.",
            "Seus sonhos são portadores de mensagens importantes; preste atenção a eles.",
            "Uma decisão difícil está à frente, mas confie na sabedoria do coração.",
            "A energia positiva do Sol trará clareza a uma situação confusa.",
            "Evite confrontos desnecessários; a diplomacia será sua aliada.",
            "A viagem que você está prestes a fazer abrirá portas para novas possibilidades.",
            "O amor verdadeiro está à vista, mas requer paciência para florescer.",
            "A sorte estará do seu lado, especialmente em questões financeiras.",
            "Um período de transformação pessoal o aguarda; abrace as mudanças.",
            "A influência de uma figura feminina será significativa em sua jornada.",
            "Cuidado com a traição de alguém próximo; a confiança é preciosa.",
            "Uma oportunidade de negócio inesperada trará prosperidade.",
            "Siga sua intuição em questões de relacionamento; ela não o decepcionará.",
            "A cura emocional virá através da expressão criativa; encontre sua saída artística.",
            "Seu destino está entrelaçado com o de uma alma gêmea espiritual.",
            "A lua cheia traz revelações intensas; esteja preparado para a verdade.",
            "Uma mudança de residência está no horizonte; isso trará estabilidade.",
            "Uma figura do passado ressurgirá, trazendo consigo lições valiosas.",
            "Cuidado com a inveja ao seu redor; proteja suas conquistas com discrição.",
            "A dualidade de escolhas se desdobrará; escolha com sabedoria.",
            "A espiritualidade se tornará uma parte essencial de sua jornada.",
            "Uma herança inesperada trará mudanças significativas em sua vida.",
            "A criatividade será sua força motriz; permita que ela floresça.",
            "Um reencontro com um antigo amor trará à tona sentimentos profundos.",
            "A sabedoria dos mais velhos será crucial em momentos de indecisão.",
            "Um novo começo romântico aguarda, trazendo paixão e vitalidade.",
            "Cuidado com um projeto aparentemente sólido; a verdade pode surpreendê-lo.",
            "A energia do universo conspira a seu favor; confie no processo.",
            "Uma jornada espiritual o levará a descobertas profundas sobre si mesmo.",
            "A comunicação será fundamental para resolver conflitos interpessoais.",
            "A influência de um animal de estimação trará alegria e companheirismo.",
            "Um segredo há muito guardado será revelado, trazendo alívio.",
            "Seus talentos criativos serão reconhecidos e recompensados.",
            "Ajuste seu foco para encontrar a clareza em meio à confusão.",
            "Uma mudança na rotina diária abrirá portas para novas oportunidades.",
            "A conexão com a natureza será terapêutica; passe mais tempo ao ar livre.",
            "Uma amizade tóxica precisa ser deixada para trás para o seu bem.",
            "A Lua Cheia trará à luz uma situação obscura que precisa ser enfrentada.",
            "A generosidade trará recompensas inesperadas; compartilhe o que puder.",
            "O equilíbrio entre trabalho e lazer será crucial para sua saúde mental.",
            "Um objeto perdido será encontrado, trazendo alívio e satisfação.",
            "A carta da Justiça indica que as recompensas serão proporcionais ao esforço.",
            "Seu guia espiritual está enviando sinais; esteja atento aos sinais sutis.",
            "Um novo círculo social trará oportunidades de crescimento e aprendizado.",
            "A energia do amor-próprio será uma força poderosa em sua vida.",
            "A resolução de um conflito antigo abrirá caminho para a cura emocional.",
            "A sorte estará ao seu lado em transações financeiras importantes.",
            "Cuidado com um estranho benevolente que entrará em sua vida; confie.",
            "Aprimore suas habilidades intuitivas; elas o guiarão com precisão.",
            "Um projeto criativo tomará forma, trazendo reconhecimento e sucesso.",
            "A dualidade de escolhas se desdobrará; escolha com sabedoria.",
            "Seu animal espiritual está enviando mensagens; preste atenção aos sinais.",
            "A influência de um mentor transformará sua jornada espiritual.",
            "Uma jornada espiritual o levará a descobertas profundas sobre si mesmo.",
            "O perdão será a chave para liberar energia positiva em sua vida.",
            "Um relacionamento atual passará por transformações, trazendo equilíbrio.",
            "A energia lunar influenciará seus sonhos; anote e interprete-os.",
            "Um reencontro com um antigo amigo trará nostalgia e reflexão.",
            "A lealdade de um ente querido será testada; mantenha a fé.",
            "Um projeto criativo tomará forma, trazendo reconhecimento e sucesso.",
            "A justiça será feita em uma situação que tem causado angústia.",
            "A conexão com suas raízes culturais trará um senso mais profundo de identidade.",
            "Um objeto valioso será perdido e depois recuperado; seja cuidadoso.",
            "A proteção dos guias espirituais está ao seu redor; confie no processo.",
            "A paciência será testada, mas trará recompensas duradouras.",
            "Uma figura do passado ressurgirá, trazendo consigo lições valiosas.",
            "A intuição feminina desempenhará um papel crucial em decisões importantes.",
            "Uma situação financeira desafiadora será superada com determinação.",
            "A influência de um mentor espiritual trará clareza à sua jornada.",
            "O poder de cura está em suas mãos; use-o com responsabilidade.",
            "Cuidado com intrigas e fofocas; foque em energias positivas.",
            "Um novo começo romântico trará paixão e vitalidade à sua vida amorosa.",
            "A estabilidade financeira será alcançada através de investimentos sábios.",
            "A influência de uma figura paterna será significativa em tempos desafiadores.",
            "A harmonia familiar será restaurada através da comunicação aberta.",
            "A energia do solstício trará mudanças significativas em sua vida.",
            "Cuidado com promessas vazias; a verdade se revelará com o tempo.",
            "A colaboração com outros será benéfica em projetos criativos.",
            "O poder de manifestação está em suas mãos; visualize seus objetivos.",
            "A energia da Lua Nova trará oportunidades para novos começos.",
            "Uma figura espiritual protetora está guiando seus passos; confie nela.",
            "A sabedoria ancestral está disponível para você; busque conhecimento.",
            "Cuidado com um relacionamento tóxico; é hora de se libertar.",
            "Um reencontro com um antigo amor trará à tona emoções intensas.",
            "A cura emocional virá através da expressão artística; explore sua criatividade.",
            "Uma mudança de residência está no horizonte, trazendo estabilidade.",
            "A energia do eclipse revelará verdades ocultas; esteja preparado.",
            "A influência de uma criança trará alegria e uma perspectiva renovada.",
            "Um segredo do passado será revelado, trazendo liberação emocional.",
            "A paciência será testada, mas a recompensa será significativa.",
            "Uma oportunidade de viagem inesperada trará aventuras emocionantes.",
            "Cuidado com uma amizade falsa; confie em seu instinto.",
            "A influência de uma figura espiritual feminina será significativa."};

    private TextView respostaText;
    private ImageView redemoinhoImage;
    private Button novaConsultaButton;
    private ImageView voltarButton;
    private boolean redemoinhoClicado = false;
    private boolean novaConsultaClicada = false;
    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventos);

        respostaText = findViewById(R.id.respostaText);
        animationView = findViewById(R.id.animationView);
//        redemoinhoImage = findViewById(R.id.redemoinhoImage);
        novaConsultaButton = findViewById(R.id.novaConsultaButton);
        voltarButton = findViewById(R.id.voltarButton);
        novaConsultaButton.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                exibirMensagem();
            }
        }, 1000);

        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!redemoinhoClicado && !novaConsultaClicada) {
                    redemoinhoClicado = true;
                    reproduzirAnimacao();
                } else if (novaConsultaClicada) {
                    novaConsultaClicada = false; // Redefina para false para evitar exibir a resposta novamente
                    reproduzirAnimacao();
                }
            }
        });

        novaConsultaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respostaText.setText("");
                novaConsultaButton.setVisibility(View.INVISIBLE);
                voltarButton.setVisibility(View.INVISIBLE);

                novaConsultaClicada = true;


            }
        });




        voltarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void reproduzirAnimacao() {
        // Reproduzir a animação por 2 segundos
        animationView.playAnimation();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animationView.cancelAnimation();

                String resposta = obterRespostaAleatoria();
                respostaText.setText(resposta);
                voltarButton.setVisibility(View.VISIBLE);
                novaConsultaButton.setVisibility(View.VISIBLE);

            }
        }, 3500);
    }

    private void exibirMensagem() {
        Toast.makeText(this, "Toque no redemoinho para saber sua resposta", Toast.LENGTH_LONG).show();
    }

    private String obterRespostaAleatoria() {
        Random random = new Random();
        int index = random.nextInt(respostas.length);
        return respostas[index];
    }
}
