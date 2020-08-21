package lliuyi.servlet;

import lliuyi.Dao.ExamRecordDAO;
import lliuyi.model.ExamRecord;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/examRecord/query")
public class ExamRecordQueryServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        List<ExamRecord> records = ExamRecordDAO.query();
        return records;
    }
}
