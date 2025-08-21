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

public class SabedoriaActivity extends AppCompatActivity {

    private String[] respostas = {
            "A vida é uma jornada, não um destino.",
            "O tempo é a moeda da vida. Gaste-o sabiamente.",
            "Seja a mudança que você quer ver no mundo. - Mahatma Gandhi",
            "A vida é curta, sorria enquanto ainda tem dentes.",
            "A verdadeira sabedoria está em reconhecer a própria ignorância.",
            "A vida é 10% do que acontece comigo e 90% de como eu reajo a isso. - Charles R. Swindoll",
            "O segredo da felicidade é aceitar onde você está na vida e tirar o melhor dela todos os dias.",
            "Não viva para impressionar os outros; viva para se impressionar.",
            "A gratidão transforma o que temos em suficiente.",
            "Cada novo dia é outra chance de mudar sua vida.",
            "A vida é uma série de escolhas. Escolha sabiamente.",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia. - Robert Collier",
            "O ontem é história, o amanhã é um mistério, mas o hoje é um presente.",
            "O verdadeiro teste de caráter é como você trata aqueles que não podem fazer nada por você.",
            "A vida é uma obra de arte que você mesmo cria.",
            "A vida não é medida pelo número de vezes que você respira, mas pelos momentos que tiram seu fôlego.",
            "A felicidade não é algo pronto. Ela vem das suas próprias ações.",
            "A vida é 10% do que acontece conosco e 90% de como respondemos a isso. - Charles R. Swindoll",
            "O segredo para viver bem e por mais tempo é: coma a metade, ande o dobro, ria o triplo e ame sem medida.",
            "Não espere. A vida é curta. Faça o que você ama, e faça-o frequentemente.",
            "A vida é feita de escolhas. Algumas doem, outras mudam tudo.",
            "O amor é a resposta, e a pergunta é irrelevante.",
            "O dinheiro é um bom criado, mas um péssimo mestre.",
            "Cada dia é uma nova chance de mudar sua vida.",
            "Aceite o que é, deixe ir o que foi, acredite no que será.",
            "O maior prazer na vida é fazer o que as pessoas dizem que você não pode fazer.",
            "Aprenda com ontem, viva para hoje, esperança para amanhã.",
            "A verdadeira sabedoria está em saber que você não sabe tudo.",
            "A vida é curta, aproveite cada momento.",
            "O tempo é o melhor professor; infelizmente, ele mata todos os seus alunos.",
            "A felicidade não é uma meta, é uma jornada.",
            "Não conte os dias, faça os dias contarem.",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
            "A vida é 10% do que acontece com você e 90% de como você reage a isso.",
            "A paciência é a chave para resolver muitos problemas.",
            "Aceite o que você não pode mudar, mude o que você não pode aceitar.",
            "O amor é a resposta, não importa a pergunta.",
            "A vida começa no final da sua zona de conforto.",
            "Seja a mudança que você deseja ver no mundo.",
            "A gratidão transforma o que temos em suficiente.",
            "Cada dia é uma nova oportunidade para mudar sua vida.",
            "Seja gentil, pois cada pessoa que você encontra está lutando uma batalha que você não conhece.",
            "O que você pensa, você se torna. O que você sente, você atrai. O que você imagina, você cria.",
            "A simplicidade é a verdadeira sofisticação.",
            "A vida é uma peça de teatro que não permite ensaios. Por isso, cante, chore, dance, ria e viva intensamente.",
            "O perdão é a chave para a ação e a liberdade.",
            "Quem olha para fora, sonha; quem olha para dentro, acorda.",
            "O que você semeia hoje, colherá amanhã.",
            "Cada escolha que você faz molda o seu destino.",
            "O segredo da felicidade é encontrar alegria nas coisas mais simples.",
            "O sucesso é a realização progressiva de um objetivo digno.",
            "O melhor modo de prever o futuro é criá-lo.",
            "O tempo é um grande professor, mas infelizmente ele mata todos os seus pupilos.",
            "A amizade é o conforto indescritível de se sentir seguro com uma pessoa, sem ter que pesar os pensamentos.",
            "A verdadeira medida de um homem não é como ele se comporta em momentos de conforto e conveniência, mas como ele se mantém em tempos de desafio e controvérsia.",
            "A vida é um eco; o que você envia volta.",
            "A mente é tudo. O que você pensa, você se torna.",
            "Você não pode controlar todas as situações da vida, mas pode controlar sua atitude em relação a elas.",
            "A felicidade não é algo pronto. Ela vem de suas próprias ações.",
            "A sabedoria é saber o que fazer; a virtude é fazer isso.",
            "Seja a mudança que você quer ver no mundo.",
            "A persistência realiza o impossível.",
            "O riso é a música da alma.",
            "O tempo não espera por ninguém, então não perca tempo se preocupando com o que as pessoas pensam de você.",
            "Não busque sucesso, busque a excelência. O sucesso virá naturalmente.",
            "A maior glória em viver não está em nunca cair, mas em se levantar cada vez que caímos.",
            "Não viva para agradar os outros. Agrade a si mesmo primeiro.",
            "A vida não é sobre esperar que a tempestade passe, mas sobre aprender a dançar na chuva.",
            "A sabedoria começa na reflexão.",
            "A verdadeira sabedoria está em reconhecer a própria ignorância.",
            "O amor é a única coisa que cresce quando é compartilhado.",
            "A compaixão é a linguagem que o surdo pode ouvir e o cego pode ver.",
            "O destino não é uma questão de sorte, mas uma questão de escolha.",
            "A felicidade não está naquilo que você possui, mas no que você é.",
            "Há um novo começo em seu horizonte.",
            "As estrelas revelam que mudanças significativas estão a caminho.",
            "Um antigo amigo pode ressurgir em sua vida em breve.",
            "A vida é uma jornada, não um destino.",
            "O tempo é a moeda da vida. Gaste-o sabiamente.",
            "Seja a mudança que você quer ver no mundo. - Mahatma Gandhi",
            "A vida é curta, sorria enquanto ainda tem dentes.",
            "A verdadeira sabedoria está em reconhecer a própria ignorância.",
            "A vida é 10% do que acontece comigo e 90% de como eu reajo a isso. - Charles R. Swindoll",
            "O segredo da felicidade é aceitar onde você está na vida e tirar o melhor dela todos os dias.",
            "Não viva para impressionar os outros; viva para se impressionar.",
            "A gratidão transforma o que temos em suficiente.",
            "Cada novo dia é outra chance de mudar sua vida.",
            "A vida é uma série de escolhas. Escolha sabiamente.",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia. - Robert Collier",
            "O ontem é história, o amanhã é um mistério, mas o hoje é um presente.",
            "O verdadeiro teste de caráter é como você trata aqueles que não podem fazer nada por você.",
            "A vida é uma obra de arte que você mesmo cria.",
            "A vida não é medida pelo número de vezes que você respira, mas pelos momentos que tiram seu fôlego.",
            "A felicidade não é algo pronto. Ela vem das suas próprias ações.",
            "A vida é 10% do que acontece conosco e 90% de como respondemos a isso. - Charles R. Swindoll",
            "O segredo para viver bem e por mais tempo é: coma a metade, ande o dobro, ria o triplo e ame sem medida.",
            "Não espere. A vida é curta. Faça o que você ama, e faça-o frequentemente.",
            "A vida é feita de escolhas. Algumas doem, outras mudam tudo.",
            "O amor é a resposta, e a pergunta é irrelevante.",
            "O dinheiro é um bom criado, mas um péssimo mestre.",
            "Cada dia é uma nova chance de mudar sua vida.",
            "Aceite o que é, deixe ir o que foi, acredite no que será.",
            "O maior prazer na vida é fazer o que as pessoas dizem que você não pode fazer.",
            "Aprenda com ontem, viva para hoje, esperança para amanhã.",
            "A verdadeira sabedoria está em saber que você não sabe tudo.",
            "A vida é curta, aproveite cada momento.",
            "O tempo é o melhor professor; infelizmente, ele mata todos os seus alunos.",
            "A felicidade não é uma meta, é uma jornada.",
            "Não conte os dias, faça os dias contarem.",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
            "A vida é 10% do que acontece com você e 90% de como você reage a isso.",
            "A paciência é a chave para resolver muitos problemas.",
            "Aceite o que você não pode mudar, mude o que você não pode aceitar.",
            "O amor é a resposta, não importa a pergunta.",
            "A vida começa no final da sua zona de conforto.",
            "Seja a mudança que você deseja ver no mundo.",
            "A gratidão transforma o que temos em suficiente.",
            "Cada dia é uma nova oportunidade para mudar sua vida.",
            "Seja gentil, pois cada pessoa que você encontra está lutando uma batalha que você não conhece.",
            "O que você pensa, você se torna. O que você sente, você atrai. O que você imagina, você cria.",
            "A simplicidade é a verdadeira sofisticação.",
            "A vida é uma peça de teatro que não permite ensaios. Por isso, cante, chore, dance, ria e viva intensamente.",
            "O perdão é a chave para a ação e a liberdade.",
            "Quem olha para fora, sonha; quem olha para dentro, acorda.",
            "O que você semeia hoje, colherá amanhã.",
            "Cada escolha que você faz molda o seu destino.",
            "O segredo da felicidade é encontrar alegria nas coisas mais simples.",
            "O sucesso é a realização progressiva de um objetivo digno.",
            "O melhor modo de prever o futuro é criá-lo.",
            "O tempo é um grande professor, mas infelizmente ele mata todos os seus pupilos.",
            "A amizade é o conforto indescritível de se sentir seguro com uma pessoa, sem ter que pesar os pensamentos.",
            "A verdadeira medida de um homem não é como ele se comporta em momentos de conforto e conveniência, mas como ele se mantém em tempos de desafio e controvérsia.",
            "A vida é um eco; o que você envia volta.",
            "A mente é tudo. O que você pensa, você se torna.",
            "Você não pode controlar todas as situações da vida, mas pode controlar sua atitude em relação a elas.",
            "A felicidade não é algo pronto. Ela vem de suas próprias ações.",
            "A sabedoria é saber o que fazer; a virtude é fazer isso.",
            "Seja a mudança que você quer ver no mundo.",
            "A persistência realiza o impossível.",
            "O riso é a música da alma.",
            "O tempo não espera por ninguém, então não perca tempo se preocupando com o que as pessoas pensam de você.",
            "Não busque sucesso, busque a excelência. O sucesso virá naturalmente.",
            "A maior glória em viver não está em nunca cair, mas em se levantar cada vez que caímos.",
            "Não viva para agradar os outros. Agrade a si mesmo primeiro.",
            "A vida não é sobre esperar que a tempestade passe, mas sobre aprender a dançar na chuva.",
            "A sabedoria começa na reflexão.",
            "A verdadeira sabedoria está em reconhecer a própria ignorância.",
            "O amor é a única coisa que cresce quando é compartilhado.",
            "A compaixão é a linguagem que o surdo pode ouvir e o cego pode ver.",
            "O destino não é uma questão de sorte, mas uma questão de escolha.",
            "A felicidade não é algo que você adia para o futuro; é algo que você projeta para o presente.",
            "O sucesso não é a chave para a felicidade. A felicidade é a chave para o sucesso. Se você ama o que está fazendo, você será bem-sucedido.",
            "Quem olha para fora, sonha; quem olha para dentro, desperta.",
            "O passado não é igual ao futuro.",
            "A vida é 10% do que acontece conosco e 90% de como reagimos a isso.",
            "As coisas boas da vida estão nas pequenas alegrias do dia a dia.",
            "Seja grato pelo que você tem enquanto trabalha pelo que você quer.",
            "As palavras têm o poder de curar ou ferir. Escolha sabiamente.",
            "O conhecimento fala, mas a sabedoria escuta.",
            "O verdadeiro teste de caráter é como você trata aqueles que não podem fazer nada por você.",
            "A melhor maneira de prever o futuro é criá-lo.",
            "O segredo da mudança é focar toda a sua energia não em lutar contra o velho, mas em construir o novo.",
            "Quanto mais você agradece, mais coisas boas acontecem.",
            "A mente é como um pára-quedas: só funciona se estiver aberta.",
            "Você é o autor da sua própria história; por que não escrever um conto incrível?",
            "A vida é feita de escolhas. Escolha ser feliz.",
            "A compaixão para com os outros começa com a auto compaixão.",
            "Cada dia é uma nova chance de fazer algo incrível.",
            "O riso é atemporal, a imaginação não tem idade e os sonhos são para sempre.",
            "A verdadeira liberdade é viver da maneira que realmente desejamos.",
            "A paciência é a chave que desbloqueia todas as portas fechadas.",
            "Aceite o que é, deixe ir o que foi, acredite no que será.",
            "A verdadeira riqueza é medida por quanto você dá, não por quanto você tem.",
            "O amor é a força mais poderosa do mundo.",
            "Seja uma voz, não um eco.",
            "A jornada de mil milhas começa com um único passo.",
            "A alegria não está nas coisas, está em nós.",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
            "A simplicidade é a sofisticação final.",
            "O que você pensa sobre si mesmo é mais importante do que o que os outros pensam sobre você.",
            "Cada novo amanhecer é uma nova oportunidade para recomeçar.",
            "Seja a mudança que você quer ver no mundo.",
            "O futuro pertence àqueles que acreditam na beleza de seus sonhos.",
            "Não espere por oportunidades excepcionais. Crie-as.",
            "O sucesso não é final, o fracasso não é fatal: é a coragem de continuar que conta.",
            "A vida é uma série de lições, cada uma nos ensinando algo valioso.",
            "O amor é a única coisa que cresce quando compartilhado.",
            "O importante não é o que acontece conosco, mas como respondemos a isso.",
            "O verdadeiro significado da vida é plantar árvores, sob cuja sombra você não espera se sentar.",
            "Não conte os dias, faça os dias contarem.",
            "A melhor maneira de prever o futuro é criá-lo.",
            "O sucesso não é a chave para a felicidade. A felicidade é a chave para o sucesso.",
            "O amor é a única força capaz de transformar um inimigo em amigo.",
            "Não busque a perfeição, busque o progresso.",
    };


    private TextView respostaText;
    private ImageView estrelaImage;
    private Button novaConsultaButton;
    private ImageView voltarButton;
    private boolean estrelaClicado = false;
    private boolean novaConsultaClicada = false;
    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabedoria);

        respostaText = findViewById(R.id.respostaText);
        animationView = findViewById(R.id.animationView);
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
                if (!estrelaClicado && !novaConsultaClicada) {
                    estrelaClicado = true;
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
        }, 4050);
    }

    private void exibirMensagem() {
        Toast.makeText(this, "Toque na estrela para saber sua resposta", Toast.LENGTH_LONG).show();
    }

    private String obterRespostaAleatoria() {
        Random random = new Random();
        int index = random.nextInt(respostas.length);
        return respostas[index];
    }
}
