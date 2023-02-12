public class Persone {
        private String nome;  

        public Persone(String nome) {
            this.nome = nome;        
        }     
    
        public Persone() {
            this.nome = "";        
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Persone other = (Persone) obj;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Persone [nome=" + nome + "]";
        }     
}
