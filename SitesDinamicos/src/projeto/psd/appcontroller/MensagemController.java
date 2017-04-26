package projeto.psd.appcontroller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projeto.psd.entidades.Mensagem;
import projeto.psd.gerenciadores.GerenciadorMensagem;
import projeto.psd.interfaces.Command;

public class MensagemController implements Command{

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws SQLException, ClassNotFoundException, IOException,
            ServletException {
        
        String mensagem = req.getParameter("mensagem");
        String emailDe = req.getParameter("emailDe");
        String emailPara = req.getParameter("emailPara");
        
        Mensagem msg = new Mensagem();
        msg.setDeEmail(emailDe);
        msg.setParaEmail(emailPara);
        msg.setMensagem(mensagem);
        
        GerenciadorMensagem gm = new GerenciadorMensagem();
        gm.add(msg);
        
        gm.closeConexao();
        
        if(!req.getParameter("pagina").equals("Mensagens.jsp"))
            res.sendRedirect("Inicial.jsp");
        else
            res.sendRedirect("Mensagens.jsp");
    }
    
}