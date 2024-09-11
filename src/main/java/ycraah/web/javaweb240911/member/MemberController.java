package ycraah.web.javaweb240911.member;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/mem.do")
public class MemberController extends HttpServlet {
  MemberDAO dao; //dao를 멤버 변수로 설정하여 서블릿이 살아있는 동안 다른 메서드에서 사용 가능하게 함
  @Override
  public void init() throws ServletException {
    dao = new MemberDAO();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doHandle(req,resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doHandle(req,resp);
  }

  private void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    resp.setContentType("text/html;charset=UTF-8");
    List<MemberVO> membersList = dao.listMembers();
    req.setAttribute("membersList", membersList);
    req.getRequestDispatcher("/WEB-INF/jsp/member.jsp").forward(req, resp);

  }

}
