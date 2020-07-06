import org.libertas.dao.CidadeDao;
import org.libertas.dao.PessoaDao;
import org.libertas.pojo.Cidade;
import org.libertas.pojo.Pessoa;

public class Mainteste {

	public static void main(String[] args) {
		CidadeDao cdao = new CidadeDao();
		Cidade c = new Cidade();
		
		c.setCidade("Paraiso");
		c.setEstado("MG");
		
		cdao.salvar(c);
	}
}