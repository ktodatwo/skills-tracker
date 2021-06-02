package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="", method = {RequestMethod.POST})

public class SkillsTrackerController {

    //responds to /
    //here is where the form is added
    @GetMapping
    @ResponseBody
    public String skilltracker() {
        return "<html>\n" +
                "<body>\n" +
                "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn.  Here is the list!</h2>\n" +
                "<ol>\n" +
                "<li>Java</li>\n" +
                "<li>JavaScript</li>\n" +
                "<li>Python</li>\n" +
                "</ol>\n" +
                "</body>\n" +
                "</html>";
    }

    //responds to /form
    //here is where the form is presented with an update
    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<p>Name:</p>" +
                        "<form method = 'post' action = '/skillTrackerFormReply'>" +
                        "<input type = 'text' name = 'name'/>" +
                        "<br />" +
                        "<p>My favorite language:</p>" +
                        "<select name='languageone'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<p>My second favorite language:</p>" +
                        "<select name='languagetwo'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<p>My third favorite language:</p>" +
                        "<select name='languagethree'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br />" +
                        "<input type='submit' value= 'submit'/>"+
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @RequestMapping(value="skillTrackerFormReply", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String skillForm(@RequestParam String name, @RequestParam String languageone, @RequestParam String languagetwo, @RequestParam String languagethree) {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>"+
                "<li>"+languageone+"</li>" +
                "<li>"+languagetwo+"</li>" +
                "<li>"+languagethree+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    }




