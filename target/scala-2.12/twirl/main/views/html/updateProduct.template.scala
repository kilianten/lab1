
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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.78*/("""
"""),_display_(/*3.2*/main("Update product", user)/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Product</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateProductSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""
    """),_display_(/*10.6*/inputText(updateProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.87*/("""
    """),_display_(/*11.6*/inputText(updateProductForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*11.101*/("""
    """),format.raw/*12.5*/("""<!-- """),_display_(/*12.11*/select(updateProductForm("category.id"),options(Category.options),'_label -> "Category", '_default -> "-- Choose a category --", '_showConstraints -> false, 'class -> "form-control")),format.raw/*12.193*/("""      """),format.raw/*12.199*/("""-->
    """),_display_(/*13.6*/for((value, name) <- Category.options) yield /*13.44*/{_display_(Seq[Any](format.raw/*13.45*/("""
        """),format.raw/*14.9*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*14.59*/value),format.raw/*14.64*/(""""
        """),_display_(/*15.10*/if(Category.inCategory(value.toLong, id))/*15.51*/{_display_(Seq[Any](format.raw/*15.52*/("""
            """),format.raw/*16.13*/("""checked
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""/>"""),_display_(/*18.12*/name),format.raw/*18.16*/("""<br>
    """)))}),format.raw/*19.6*/("""
    """),_display_(/*20.6*/inputText(updateProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*20.89*/("""
    """),_display_(/*21.6*/inputText(updateProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*21.89*/("""
    
    """),format.raw/*23.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Add/Update Product" class="btn btn-primary">
        
        <a href=""""),_display_(/*30.19*/routes/*30.25*/.HomeController.index(0)),format.raw/*30.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*34.3*/("""
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 18:31:18 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/updateProduct.scala.html
                  HASH: f54ec3e34a692fdf4eb89e4f0f03602aadc0c4fa
                  MATRIX: 993->1|1142->79|1187->77|1214->96|1250->124|1288->125|1315->126|1378->164|1525->303|1564->305|1596->338|1627->344|1639->348|1669->358|1701->364|1803->445|1835->451|1952->546|1984->551|2017->557|2221->739|2256->745|2291->754|2345->792|2384->793|2420->802|2497->852|2523->857|2561->868|2611->909|2650->910|2691->923|2739->940|2775->949|2805->952|2830->956|2870->966|2902->972|3006->1055|3038->1061|3142->1144|3179->1154|3443->1391|3458->1397|3503->1421|3636->1524|3668->1526
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|49->17|50->18|50->18|50->18|51->19|52->20|52->20|53->21|53->21|55->23|62->30|62->30|62->30|66->34|67->35
                  -- GENERATED --
              */
          