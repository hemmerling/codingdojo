<%@ Page Language="C#" %>
<script runat="server">
  private void Button1_Click(object sender, System.EventArgs e)
  {
    int alpha = int.Parse(TextBox1.Text.Trim());
    int  beta = int.Parse(TextBox2.Text.Trim());

    System.Threading.Thread.Sleep(3000);
        
    if (RadioButton1.Checked) {
      TextBox3.Text = Sum(alpha, beta).ToString("F4");
    }
    else if (RadioButton2.Checked) {
      TextBox3.Text = Product(alpha, beta).ToString("F4");
    }
    else
     TextBox3.Text = "Select method"; 
    }

    private static double Sum(int a, int b) {
      double ans = a + b;
      return ans;
    }
    private static double Product(int a, int b) {
      double ans = a * b;
      return ans;
    }
</script>

<html>
  <head>
    <style type="text/css">
     fieldset { width: 16em }
     body { font-size: 10pt; font-family: Arial }
    </style>
    <title>Default.aspx</title>
  </head>
  <body bgColor="#ccffff">
    <h3>MiniCalc by ASP.NET</h3>
    <form method="post" name="theForm" id="theForm"
     runat="server" action="Default.aspx"> 
     <asp:RequiredFieldValidator id="valRequired" runat="server" ControlToValidate="TextBox1" ErrorMessage="Required in TextBox1" Display="dynamic">Required</asp:RequiredFieldValidator>
      <p><asp:Label id="Label1" runat="server">
      Enter integer:&nbsp&nbsp</asp:Label>
      <asp:TextBox id="TextBox1" width="100" runat="server" /></p>
      <p><asp:Label id="Label2" runat="server">
      Enter another:&nbsp</asp:Label>
      <asp:TextBox id="TextBox2" width="100"  runat="server" /></p>
      <p></p>
      <fieldset>
       <legend>Arithmentic Operation</legend>
       <p><asp:RadioButton id="RadioButton1" GroupName="Operation"
        runat="server"/>Addition</p>
       <p><asp:RadioButton id="RadioButton2" GroupName="Operation"
        runat="server"/>Multiplication</p>
       <p></p>
      </fieldset>
      <p><asp:Button id="Button1" runat="server" text=" Calculate "
       onclick="Button1_Click" /> </p>
      <p><asp:TextBox id="TextBox3" width="120"  runat="server" />
    </form>
  </body>
</html>

