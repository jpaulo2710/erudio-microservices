package br.com.erudio.controller;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MathController {

    SimpleMath math = new SimpleMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable(value= "numberOne") String numberOne,@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumetic(numberOne) || !NumberConverter.isNumetic(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        return math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sub(@PathVariable(value= "numberOne") String numberOne,@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumetic(numberOne) || !NumberConverter.isNumetic(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        return math.sub(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value="/multi/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multi(@PathVariable(value= "numberOne") String numberOne,@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumetic(numberOne) || !NumberConverter.isNumetic(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        return math.mult(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double div(@PathVariable(value= "numberOne") String numberOne,@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumetic(numberOne) || !NumberConverter.isNumetic(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        return math.div(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value="/med/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double med(@PathVariable(value= "numberOne") String numberOne,@PathVariable(value= "numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumetic(numberOne) || !NumberConverter.isNumetic(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        return math.mean(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value="/raiz/{numberOne}", method= RequestMethod.GET)
    public Double raiz(@PathVariable(value= "numberOne") String numberOne) throws Exception {
        if(!NumberConverter.isNumetic(numberOne)) throw new UnsuportedMathOperationException("Please set a numeric value!");
        return math.squateRoot(NumberConverter.convertToDouble(numberOne));
    }


}
