
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),format.raw/*14.9*/("""<!-- """),_display_(/*14.15*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*19.10*/(""" """),format.raw/*19.11*/("""-->
        """),_display_(/*20.10*/for((value, name) <- Category.options) yield /*20.48*/ {_display_(Seq[Any](format.raw/*20.50*/("""
            """),format.raw/*21.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*21.63*/value),format.raw/*21.68*/(""""

            />"""),_display_(/*23.16*/name),format.raw/*23.20*/("""<br>
        """)))}),format.raw/*24.10*/("""
        """),_display_(/*25.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*25.99*/("""
        """),_display_(/*26.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*26.87*/("""
        """),_display_(/*27.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*27.87*/("""

        """),_display_(/*29.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*29.74*/("""
        
        """),format.raw/*31.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*36.23*/routes/*36.29*/.HomeController.index(0)),format.raw/*36.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*40.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 18:31:18 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/addProduct.scala.html
                  HASH: 438aa21d4a3f4351e3ca6dfe3aaa47e910131a0c
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1738->377|1834->452|1870->461|1903->467|2160->703|2189->704|2229->717|2283->755|2323->757|2364->770|2441->820|2467->825|2512->843|2537->847|2582->861|2619->871|2729->960|2766->970|2864->1047|2901->1057|2999->1134|3037->1145|3122->1209|3167->1227|3438->1471|3453->1477|3498->1501|3646->1619
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|55->23|56->24|57->25|57->25|58->26|58->26|59->27|59->27|61->29|61->29|63->31|68->36|68->36|68->36|72->40
                  -- GENERATED --
              */
          