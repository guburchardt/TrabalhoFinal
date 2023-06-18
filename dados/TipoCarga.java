package dados;

public class TipoCarga{
    
        private int codigo;
    
        private String descricao;

        public TipoCarga()
        {
    
        }

        public TipoCarga(int codigo, String descricao)
        {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        public void setCodigo(int codigo)
        {
            this.codigo = codigo;
        }

        public int getCodigo()
        {
            return this.codigo;
        }

        public void setDescricao(String descricao)
        {
            this.descricao = descricao;
        }

        public String getDescricao()
        {
            return this.descricao;
        }


    
        
}