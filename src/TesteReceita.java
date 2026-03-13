public class TesteReceita {
    public static void main(String[] args) {
        TesteClasseReceita boloMilho = new TesteClasseReceita();
        boloMilho.nomeReceita = "Bolo de milho";
        boloMilho.autor = "Shakira";
        boloMilho.custo = "CARO demais";
        boloMilho.tempoDePreparo = 50;
        boloMilho.dificuldade = "Hard demais";
        boloMilho.nota = 5;
        boloMilho.porcoes = 10;
        boloMilho.descricao = "Um bolo de milho, o que você achava que ia ter de mais? Me adiciona no LOL, meu código é-";
        System.out.println(boloMilho.nomeReceita);
        System.out.println(boloMilho.autor);
        System.out.println(boloMilho.tempoDePreparo + " min" + "\t\t" +
                boloMilho.dificuldade + "\t\t" +
                boloMilho.custo + "\t\t" +
                boloMilho.porcoes + " porções");
        System.out.println(boloMilho.descricao);


    }
}
