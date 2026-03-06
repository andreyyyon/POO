    public class Lampada {
        boolean ligado  = false;

        public void ligar(){
            if(ligado){
                System.out.println("Lampada já esta ligada");
            }else{
                System.out.println("Ligou a lampada");
                ligado = true;
            }
        }

        public void desligar(){
            if(!ligado){
                System.out.println("Lampada já esta desligada");
            }else{
                System.out.println("Ligou a lampada");
                ligado = false;
            }
        }

        public void status(){
            String status = ligado ? "ligada" : "desligada";

            System.out.println("Lampada esta " + status);
        }
    }
