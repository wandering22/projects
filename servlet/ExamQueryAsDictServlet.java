package lliuyi.servlet;

import lliuyi.Dao.ExamDao;
import lliuyi.model.Exam;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/exam/queryAsDict")
public class ExamQueryAsDictServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) {
        List<Exam> exams = ExamDao.queryAsDict();
        return exams;
    }
}
