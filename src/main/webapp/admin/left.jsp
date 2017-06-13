<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>无标题页</title>
    <link href="Images/css1/left_css.css" rel="stylesheet" type="text/css">
    <SCRIPT language=JavaScript>
function showsubmenu(sid)
{
whichEl = eval("submenu" + sid);
if (whichEl.style.display == "none")
{
eval("submenu" + sid + ".style.display=\"\";");
}
else
{
eval("submenu" + sid + ".style.display=\"none\";");
}
}
</SCRIPT>
</head>
<body  bgcolor="16ACFF">
    <form id="form1" runat="server">
    <div>
    <table width="98%" border="0" cellpadding="0" cellspacing="0" background="../admin/Images/tablemde.jpg">
  <tr>
    <td height="5" background="../admin/Images/tableline_top.jpg" bgcolor="#16ACFF"></td>
  </tr>
  <tr>
    <td><TABLE width="97%" 
border=0 align=right cellPadding=0 cellSpacing=0 class=leftframetable>
      <TBODY>
       
      <%--
	if(request.getSession().getAttribute("admin") != null){
		--%>
		
        <TR>
          <TD height="25" style="background:url(../admin/Images/left_tt.gif) no-repeat">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <TD width="20"></TD>
          <TD class=STYLE1 style="CURSOR: hand" onclick=showsubmenu(1); height=25>用户管理</TD>
              </tr>
            </table>
		</TD>
          </TR>
        <TR>
          <TD><TABLE id=submenu1 cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
                <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="adminadd_admin" 
            target=main>录入管理员</A></TD>
                </TR>
                <TR>
                  <TD><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="adminlist_admin" 
            target=main>管理员维护</A></TD>
                </TR>
         
                   <TR>
                  <TD><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="memberslist_admin" 
            target=main>用户管理</A></TD>
                </TR>
         
       
           
              </TBODY>
          </TABLE></TD>
        </TR>
      </TBODY>
    </TABLE></td>
  </tr>
<tr>
    <td height="5" background="../admin/Images/tableline_bottom.jpg" bgcolor="#9BC2ED"></td>
  </tr>
  
 
 
  <tr>
    <td height="5" background="../admin/Images/tableline_top.jpg" bgcolor="#9BC2ED"></td>
  </tr>
  <tr>
    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width="97%" align=right 
border=0>
      <TBODY>
        <TR>
          <TD height="25" style="background:url(../admin/Images/left_tt.gif) no-repeat"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <TD width="20"></TD>
          <TD class=STYLE1 style="CURSOR: hand" onclick=showsubmenu(4); 
    height=25>新闻管理</TD>
            </tr>
          </table></TD>
          </TR>
        <TR>
          <TD><TABLE id=submenu4 cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
                      <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="newsadd_admin" 
            target=main>添加新闻</A> </TD>
                </TR>
                   
                     <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="newslist_admin" 
            target=main>新闻管理</A> </TD>
                </TR>
              
              </TBODY>
          </TABLE></TD>
        </TR>
      </TBODY>
    </TABLE></td>
  </tr>
  <tr>
    <td height="5" background="../admin/Images/tableline_bottom.jpg" bgcolor="#9BC2ED"></td>
  </tr>
 
  
      <tr>
    <td height="5" background="../admin/Images/tableline_top.jpg" bgcolor="#9BC2ED"></td>
  </tr>
  <tr>
    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width="97%" align=right 
border=0>
      <TBODY>
        <TR>
          <TD height="25" style="background:url(../admin/Images/left_tt.gif) no-repeat"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <TD width="20"></TD>
          <TD class=STYLE1 style="CURSOR: hand" onclick=showsubmenu(5); 
    height=25>车辆管理</TD>
            </tr>
          </table></TD>
          </TR>
        <TR>
          <TD><TABLE id=submenu5 cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
                      <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="caradd_admin" 
            target=main>车辆录入</A> </TD>
                </TR>
                   
                     <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="carlist_admin" 
            target=main>车辆管理</A> </TD>
                </TR>
                
                 <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="goodsadd_admin" 
            target=main>商品添加</A> </TD>
                </TR>
                
                <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="goodslist_admin" 
            target=main>商品管理</A> </TD>
                </TR>        
              
              </TBODY>
          </TABLE></TD>
        </TR>
      </TBODY>
    </TABLE></td>
  </tr>
  <tr>
    <td height="5" background="../admin/Images/tableline_bottom.jpg" bgcolor="#9BC2ED"></td>
  </tr>            
            
          <tr>
    <td height="5" background="../admin/Images/tableline_top.jpg" bgcolor="#9BC2ED"></td>
  </tr>
  <tr>
    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width="97%" align=right 
border=0>
      <TBODY>
        <TR>
          <TD height="25" style="background:url(../admin/Images/left_tt.gif) no-repeat"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <TD width="20"></TD>
          <TD class=STYLE1 style="CURSOR: hand" onclick=showsubmenu(6); 
    height=25>订单管理</TD>
            </tr>
          </table></TD>
          </TR>
        <TR>
          <TD><TABLE id=submenu6 cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
                            
                     <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="oderslist_admin" 
            target=main>订单管理</A> </TD>
                </TR>
              
              </TBODY>
          </TABLE></TD>
        </TR>
      </TBODY>
    </TABLE></td>
  </tr>
  <tr>
    <td height="5" background="../admin/Images/tableline_bottom.jpg" bgcolor="#9BC2ED"></td>
  </tr>         
            
           <tr>
    <td height="5" background="../admin/Images/tableline_top.jpg" bgcolor="#9BC2ED"></td>
  </tr>
  <tr>
    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width="97%" align=right 
border=0>
      <TBODY>
        <TR>
          <TD height="25" style="background:url(../admin/Images/left_tt.gif) no-repeat"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <TD width="20"></TD>
          <TD class=STYLE1 style="CURSOR: hand" onclick=showsubmenu(7); 
    height=25>栏目管理</TD>
            </tr>
          </table></TD>
          </TR>
        <TR>
          <TD><TABLE id=submenu7 cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
                      <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="abouttoupdate_admin/2" 
            target=main>联系我们</A> </TD>
                </TR>
                   
                     <TR>
                  <TD width="2%"><IMG src="../admin/Images/closed.gif"></TD>
                  <TD height=23><A href="abouttoupdate_admin/1" 
            target=main>关于我们</A> </TD>
                </TR>
              
              </TBODY>
          </TABLE></TD>
        </TR>
      </TBODY>
    </TABLE></td>
  </tr>
  <tr>
    <td height="5" background="../admin/Images/tableline_bottom.jpg" bgcolor="#9BC2ED"></td>
  </tr>         
                                <%--
                              
	}
	
		--%>
                                            
             
      </TBODY>
    </TABLE></td>
  </tr>
  <tr>
    <td height="5" background="../admin/Images/tableline_bottom.jpg" bgcolor="#9BC2ED"></td>
  </tr>
</table>
    </div>
    </form>
</body>
</html>
