package projeto.psd.gerenciadores;

import java.sql.SQLException;
import java.util.List;
import projeto.psd.entidades.Usuario;
import projeto.psd.factorys.DaoFactory;
import projeto.psd.interfaces.UsuarioDaoIf;

public class GerenciadorUsuario {

    private DaoFactory fabricaDao;
    private UsuarioDaoIf ifc;

    public GerenciadorUsuario() throws ClassNotFoundException, SQLException {
        this.fabricaDao = new DaoFactory();
        this.ifc = fabricaDao.getDaoFactory().criaDaoUsuario();
    }

    public void closeConexao() throws SQLException {
        this.ifc.closeConexao();
    }

    public boolean add(Usuario usu) throws ClassNotFoundException, SQLException {

        return this.ifc.add(usu);

    }

    public boolean update(Usuario usu) throws ClassNotFoundException, SQLException {

        return this.ifc.update(usu);

    }

    public List<Usuario> readByName(String nome) throws ClassNotFoundException, SQLException {

        return this.ifc.readByNome(nome);

    }

    public boolean remove(String login, String senha) throws ClassNotFoundException, SQLException {

        return this.ifc.remove(login, senha);

    }

    public List<Usuario> listAll() throws ClassNotFoundException, SQLException {

        return this.ifc.listAll();

    }

    public Usuario readByEmail(String email) throws SQLException {

        return this.ifc.readByEmail(email);

    }
    
    public List<Usuario> filtroCor(String cor) throws SQLException {
        
        return this.ifc.filtroCor(cor);
        
    }
    
    public List<Usuario> filtroStatus(String status) throws SQLException {
        
        return this.ifc.filtroStatus(status);
        
    }
    
    public List<Usuario> filtroGeral(String cor, String status) throws SQLException {
        
        return this.ifc.filtroGeral(cor, status);
        
    }
    
    public boolean updateStatus(String email, String status) throws SQLException{
        
        return this.ifc.updateStatus(email, status);
        
    }

}
