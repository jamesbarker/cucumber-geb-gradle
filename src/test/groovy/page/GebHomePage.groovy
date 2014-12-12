package page

import geb.Page

class GebHomePage extends Page {
	static at = { title == "Geb - Very Groovy Browser Automation" }
	static content = {
		headings { $('#main h1') }
		firstHeading { headings[0] }
		crossBrowserLink(to: CrossBrowserPage) { $('li.crossbrowser a') }
	}
}
