package projeto.psd.gerenciadores;

import java.sql.SQLException;
import java.util.List;
import projeto.psd.entidades.Mensagem;
import projeto.psd.factorys.DaoFactory;
import projeto.psd.interfaces.MensagemDaoIf;

public class GerenciadorMensagem {

    private DaoFactory fabricaDao;
    private MensagemDaoIf ifc;

    public GerenciadorMensagem() throws SQLException, ClassNotFoundException {
        this.fabricaDao = new DaoFactory();
        this.ifc = fabricaDao.getDaoFactory().criaDaoMensagem();
    }

    public void closeConexao() throws SQLException {
        this.ifc.closeConexao();
    }

    public boolean add(Mensagem msg) throws SQLException, ClassNotFoundException {

        return this.ifc.add(msg);

    }
    
    public boolean remove(int id) throws SQLException, ClassNotFoundException {
        return this.ifc.remove(id);
    }

    public List<Mensagem> listAll(String paraEmail) throws SQLException, ClassNotFoundException {

        return this.ifc.listar(paraEmail);

    }

}
