
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

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.User,models.Product,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, p: models.Product):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main(p.getName , user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

    """),format.raw/*5.5*/("""<h1>"""),_display_(/*5.10*/p/*5.11*/.getName),format.raw/*5.19*/("""</h1>



    <img src="/assets/images/productImages/"""),_display_(/*9.45*/(p.getId + ".jpg")),format.raw/*9.63*/(""""/>

""")))}))
      }
    }
  }

  def render(user:models.users.User,p:models.Product): play.twirl.api.HtmlFormat.Appendable = apply(user,p)

  def f:((models.users.User,models.Product) => play.twirl.api.HtmlFormat.Appendable) = (user,p) => apply(user,p)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 19:28:29 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/productDetails.scala.html
                  HASH: 0a125758121abbbbd1f208e2d4845e328978a08d
                  MATRIX: 983->1|1122->45|1150->48|1180->70|1219->72|1251->78|1282->83|1291->84|1319->92|1398->145|1436->163
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|37->5|37->5|37->5|41->9|41->9
                  -- GENERATED --
              */
          