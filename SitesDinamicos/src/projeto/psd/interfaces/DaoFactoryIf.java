package projeto.psd.interfaces;

import java.sql.SQLException;

public interface DaoFactoryIf {

    public UsuarioDaoIf criaDaoUsuario() throws ClassNotFoundException, SQLException;

    public MensagemDaoIf criaDaoMensagem() throws SQLException, ClassNotFoundException;

    public PedidoDaoIf criaDaoPedido() throws SQLException, ClassNotFoundException;

    public AmizadeDaoIf criaDaoAmizade() throws SQLException, ClassNotFoundException;

    public GaleriaDaoIf criaDaoGaleria() throws SQLException, ClassNotFoundException;
    
    public RecomendacaoDaoIf criarDaoRecomendacao() throws SQLException, ClassNotFoundException;
    
    public RelacionamentoDaoIf criarDaoRelacionamento() throws SQLException, ClassNotFoundException;
}
