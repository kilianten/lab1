
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-products) yield /*39.26*/ {_display_(Seq[Any](format.raw/*39.28*/("""
          
          """),format.raw/*41.11*/("""<tr>
              
              <td>"""),_display_(/*43.20*/p/*43.21*/.getId),format.raw/*43.27*/("""</td>
            """),_display_(/*44.14*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*44.102*/ {_display_(Seq[Any](format.raw/*44.104*/("""
              """),format.raw/*45.15*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*45.70*/(p.getId + ".jpg")),format.raw/*45.88*/(""""/></td>
            """)))}/*46.15*/else/*46.20*/{_display_(Seq[Any](format.raw/*46.21*/("""
              """),format.raw/*47.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
            """)))}),format.raw/*48.14*/("""
            
            """),format.raw/*50.13*/("""<td><a href=""""),_display_(/*50.27*/routes/*50.33*/.HomeController.productDetails(p.getId)),format.raw/*50.72*/("""">"""),_display_(/*50.75*/p/*50.76*/.getName),format.raw/*50.84*/("""</a></td>
          
            <td>"""),_display_(/*52.18*/p/*52.19*/.getCategory.getName),format.raw/*52.39*/("""</td>        
            <td>"""),_display_(/*53.18*/p/*53.19*/.getDescription),format.raw/*53.34*/("""</td>
            <td  class="numeric">"""),_display_(/*54.35*/p/*54.36*/.getStock),format.raw/*54.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*55.37*/("%.2f".format(p.getPrice))),format.raw/*55.64*/("""</td>
            <td>
              <a href=""""),_display_(/*57.25*/routes/*57.31*/.HomeController.updateProduct(p.getId)),format.raw/*57.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*61.25*/routes/*61.31*/.HomeController.deleteProduct(p.getId)),format.raw/*61.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>

          </tr>
        
        """)))}),format.raw/*68.10*/("""
      """),format.raw/*69.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*74.17*/routes/*74.23*/.HomeController.addProduct()),format.raw/*74.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*80.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 18:46:26 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/index.scala.html
                  HASH: 80aef244ea20d23562e6345180cfd2dc65f04e1d
                  MATRIX: 1023->1|1238->120|1266->123|1295->144|1334->146|1362->148|1544->303|1559->309|1604->333|1682->385|1718->405|1758->407|1794->416|1831->426|1846->432|1897->462|1951->489|1961->490|1990->498|2029->509|2077->530|2087->531|2127->550|2185->578|2217->583|2361->701|2402->733|2442->735|2478->744|2550->789|2564->794|2600->809|2636->818|2680->832|2714->839|3011->1109|3043->1125|3083->1127|3133->1149|3199->1188|3209->1189|3236->1195|3282->1214|3380->1302|3421->1304|3464->1319|3546->1374|3585->1392|3626->1415|3639->1420|3678->1421|3721->1436|3839->1523|3893->1549|3934->1563|3949->1569|4009->1608|4039->1611|4049->1612|4078->1620|4143->1658|4153->1659|4194->1679|4252->1710|4262->1711|4298->1726|4365->1766|4375->1767|4405->1776|4474->1818|4522->1845|4596->1892|4611->1898|4670->1936|4867->2106|4882->2112|4941->2150|5171->2349|5205->2356|5280->2404|5295->2410|5344->2438|5477->2541
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|71->39|71->39|71->39|73->41|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|80->48|82->50|82->50|82->50|82->50|82->50|82->50|82->50|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|89->57|89->57|89->57|93->61|93->61|93->61|100->68|101->69|106->74|106->74|106->74|112->80
                  -- GENERATED --
              */
          