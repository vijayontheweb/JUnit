package com.gavs.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.gavs.calculator")
//@IncludePackages("com.gavs.calculator")
//@ExcludeTags("DOWN")

public class JUnit5TestSuiteExample 
{
}