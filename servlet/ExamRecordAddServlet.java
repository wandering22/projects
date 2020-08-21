package lliuyi.servlet;

import lliuyi.Dao.ExamDao;
import lliuyi.Dao.ExamRecordDAO;
import lliuyi.model.ExamRecord;
import lliuyi.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/examRecord/add")
public class ExamRecordAddServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        ExamRecord record = JSONUtil.read(req.getInputStream(),ExamRecord.class);
        int num = ExamRecordDAO.insert(record);

        return null;
    }
}
