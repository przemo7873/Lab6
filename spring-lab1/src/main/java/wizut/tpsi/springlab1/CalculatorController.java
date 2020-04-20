package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController 
{
    @RequestMapping("/calculator")
    public String calculator(Model model, CalculatorForm form)
    {
        model.addAttribute("CalculatorForm", form);
        if(form.getOperacja().contains("+")) model.addAttribute("Wynik", form.dodawanie());
        if(form.getOperacja().contains("-")) model.addAttribute("Wynik", form.odejmowanie());
        if(form.getOperacja().contains("*")) model.addAttribute("Wynik", form.mnozenie());

        return "calculator";
    }
}
