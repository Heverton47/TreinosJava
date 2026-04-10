class Carro{
    private String marca;
    private String modelo;
    private int velocidade;
    private boolean ligado;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        if(this.velocidade < 0){
            this.velocidade = 0;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }
    public void ligar(){
        if(ligado){
            System.out.println("Seu carro ja esta ligado ;3");
            return;
        }
        this.ligado = true;
    }
    public void desligar(){
        if(!ligado){
            System.out.println("Seu carro ja esta desligado ;3");
            return;
        }
        this.ligado = false;
        this.velocidade = 0;
    }
    public void acelerar(){
        if(ligado){
            this.velocidade += 10;
        }
        else{
            System.out.println("Nao e possivel acelerar, carro desligado!");
        }
    }
    public void frear(){
        if(ligado){
            this.velocidade -= 10;
            if(this.velocidade < 0){
                this.velocidade = 0;
            }
        }
        else{
            System.out.println("Nao tem como desacelerar, o carro ja esta desligado!");
        }    
    }
    public void status(){
        System.out.println(" | Marca: " + this.marca + " | Modelo: " + this.modelo + " | Velocidade: " + this.velocidade + " | Ligado: " + this.ligado);    
    }
}

public class Main3 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Carrito", "4 Rodas");
        c1.status();
        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.status();

        c1.frear();
        c1.status();
        c1.desligar();
        c1.status();
    }
}