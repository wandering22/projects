package lliuyi.servlet;

import lliuyi.Dao.ExamRecordDAO;
import lliuyi.model.ExamRecord;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/examRecord/queryById")
public class ExamRecordQueryByIdServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) {
        String id = req.getParameter("id");
        ExamRecord record = ExamRecordDAO.queryById(Integer.parseInt(id));
        return record;
    }
}
