package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String homePage() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @PostMapping("results")
    public String formResults(@RequestParam String name, @RequestParam String favorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String formPage() {
        return "<html>" +
                "<body>" +
                "<form action='results' method='post'>" +
                "<label for='name'>Name:</label>" +
                "<br>" +
                "<input id='name' type='text' name='name'>" +
                "<br>" +

                "<label for='favorite'>My favorite language:</label>" +
                "<br>" +
                "<select id='favorite' name='favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +

                "<label for='secondFavorite'>My second favorite language:</label>" +
                "<br>" +
                "<select id='secondFavorite' name='secondFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +

                "<label for='thirdFavorite'>My third favorite language:</label>" +
                "<br>" +
                "<select id='thirdFavorite' name='thirdFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +

                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
