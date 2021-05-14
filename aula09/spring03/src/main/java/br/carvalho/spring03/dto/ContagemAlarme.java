package br.carvalho.spring03.dto;

public class ContagemAlarme {
        private String nome;
        private long cont;
    
        public ContagemAlarme(String nome, long cont) {
            this.nome = nome;
            this.cont = cont;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public long getCont() {
            return cont;
        }

        public void setCont(long cont) {
            this.cont = cont;
        }
        
    
}
