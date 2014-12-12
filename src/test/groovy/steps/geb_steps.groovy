import page.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the "Geb Home" page/) { ->
	to GebHomePage
}

When(~/the link to the "Cross Browser" page is clicked/) { ->
	page.crossBrowserLink.click()
}

Then(~/I am taken to the "Geb Cross Browser" page/) { ->
	at CrossBrowserPage
}
