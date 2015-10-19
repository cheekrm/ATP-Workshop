package Google.Search.Module

import geb.Module

/**
 * Created by Ryan on 10/19/2015.
 */
class ResultModule extends Module {
    static content = {
        cell { $( 'h3 > a', it ) }
        ResultHyperlink { cell(0) }
    }
}
