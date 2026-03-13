public class TesteLivro {
    public static void main(String[] args) {
        //Criar objetos - instanciar
        Livro meuLivro = new Livro();
        meuLivro.tituloLivro = "Harry Pota: e a Pedra de Titânita";
        meuLivro.nomeAutora = "M.A. Theus";
        meuLivro.editora = "PP";
        System.out.println(meuLivro.tituloLivro);
        Livro favorito = new Livro();
        System.out.println(favorito);
        //Referênciando
        Livro l2 = meuLivro;
        System.out.println(l2.tituloLivro);
        System.out.println(l2);
    }
}
