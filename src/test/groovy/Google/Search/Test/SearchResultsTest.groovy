package Google.Search.Test

import Google.Search.Page.GoogleSearchPage
import geb.spock.GebReportingSpec
import junit.framework.Assert

/**
 * Created by Ryan on 10/19/2015.
 */
class SearchResultsTest extends GebReportingSpec
{
    def "This is a test function"()
    {
        given: "The user navigates to the Google search page"
            to GoogleSearchPage

        when: "The user enters a search phrase and clicks the search button"
            at GoogleSearchPage
            waitFor(30) { SearchInput << "Test Automation" }
            waitFor(30) { SearchButton.click() }

        then: "Search results should populate the page"
            sleep(1000)
            println("Result Set Size: " + (String)Results.size())
            Assert.assertTrue(Results.size() == 11)

    }
}
