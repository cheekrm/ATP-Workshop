package Google.Search.Page

import Google.Search.Module.ResultModule
import geb.Page

/**
 * Created by Ryan on 10/19/2015.
 */
class GoogleSearchPage extends Page
{
    static url = "https://www.google.com"
    static at = { waitFor(30) { SearchInput.isDisplayed() } }
    static content = {
        SearchInput { $('#lst-ib') }
        SearchButton { $('.sbico') }
        Results { moduleList ResultModule, $('.g') }
    }
}
