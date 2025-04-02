class Carro {
    private String modelo;
    private int ano;

    // Construtor utilizando this
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir os detalhes do carro
    public void exibir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println();
    }
}
