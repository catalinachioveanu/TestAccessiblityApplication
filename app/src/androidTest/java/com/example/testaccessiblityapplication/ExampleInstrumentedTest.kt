package com.example.testaccessiblityapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    companion object {
        @BeforeClass
        @JvmStatic
        fun enableAccessibilityChecks() {
            AccessibilityChecks.enable()
        }
    }

    /**
     * Use [ActivityScenarioRule] to create and launch the activity under test, and close it
     * after test completes. This is a replacement for [androidx.test.rule.ActivityTestRule].
     */
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        onView(withId(R.id.login_user_id)).perform(typeText("username"))
        onView(withId(R.id.login_password)).perform(typeText("password"))
        onView(withId(R.id.login_button)).perform(click())

    }

}