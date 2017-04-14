package projeto.psd.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface GaleriaDaoIf {

    public boolean add(String userEmail, String imagem) throws SQLException;

    public boolean delete(String userEmail, String imagem) throws SQLException;

    public List<String> listar(String userEmail) throws SQLException;
}
