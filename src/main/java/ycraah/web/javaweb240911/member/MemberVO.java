package ycraah.web.javaweb240911.member;

import java.time.LocalDate;

public class MemberVO {
  private long id;
  private String pwd;
  private String name;
  private String email;
  private LocalDate joinDate;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(LocalDate joinDate) {
    this.joinDate = joinDate;
  }

  @Override
  public String toString() {
    return "MemberVO{" +
        "id=" + id +
        ", pwd='" + pwd + '\'' +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", joinDate=" + joinDate +
        '}';
  }
}
