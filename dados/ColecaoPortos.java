package dados;

import java.util.ArrayList;

public class ColecaoPortos {
        private ArrayList<Porto> colecaoPortos;
        

        public ColecaoPortos() {
                colecaoPortos = new ArrayList<Porto>();
        }

        public boolean inserePorto(Porto porto) {
                return colecaoPortos.add(porto);
        }

        public Porto consultaPorto(int id) {
                for(int i=0; i<colecaoPortos.size(); i++) {
                        Porto porto = colecaoPortos.get(i);
                        if(porto.getId() == id)
                                return porto;
                }
                return null;
        }

        public boolean consultaPortoBoolean(int id) {
                for(int i=0; i<colecaoPortos.size(); i++) {
                        Porto porto = colecaoPortos.get(i);
                        if(porto.getId() == id)
                                return true;
                }
                return false;
        }

        /* 
        public ArrayList<Porto> getPortos() {
                return colecaoPortos;
        }

        public void setPortos(ArrayList<Porto> portos) {
                this.colecaoPortos = portos;
        }

       
        
        public double calculoDistancia(Porto origem, Porto destino){
                double distancia = 0;
                int pos1 = colecaoPortos.indexOf(origem) * 100;
                int pos2 = colecaoPortos.indexOf(destino) * 100;
                distancia = Math.abs(pos1 - pos2);
                return distancia;
        }
        */

}
