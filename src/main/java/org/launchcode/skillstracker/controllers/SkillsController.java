package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillReturn() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>C</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillForm() {
        return "<html>" +
                "<body>" +
                "<form action='chooseSkill'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name = 'name'><br><br>" +
                "<label>Favorite Programming Language:</label><br>" +
                "<select name = 'planguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C'>C</option>" +
                "</select><br><br>" +
                "<label>Second Favorite Programming Language:</label><br>" +
                "<select name = 'planguage2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C'>C</option>" +
                "</select><br><br>" +
                "<label>Third Favorite Programming Language:</label><br>" +
                "<select name = 'planguage3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C'>C</option>" +
                "</select><br><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "chooseSkill")
    public String skillForm(@RequestParam String name, @RequestParam String planguage, @RequestParam String planguage2, @RequestParam String planguage3) {

        return "<html>" +
                "<body>" +
                "<h1>"+ name + "</h1>" +
                "<table style='padding:15px'>" +
                "<tr>" +
                "<th style='padding:5px'>First</th>" +
                "<th style='padding:5px'>Second</th>" +
                "<th style='padding:5px'>Third</th>" +
                "</tr>" +
                "<tr>" +
                "<th style='padding:5px'>" + planguage + "</th>" +
                "<th style='padding:5px'>" + planguage2 + "</th>" +
                "<th style='padding:5px'>" + planguage3 + "</th>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";

    }
}
