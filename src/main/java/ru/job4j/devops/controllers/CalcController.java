package ru.job4j.devops.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.devops.models.Result;
import ru.job4j.devops.models.TwoArgs;

/**
 * Rest controller
 */
@RestController
@RequestMapping("calc")
public class CalcController {
    /**
     * Обработчик запроса на сложение двух чисел
     *
     * @param twoArgs аргументы
     * @return результат сложения двух чисел
     */
    @PostMapping("summarise")
    public ResponseEntity<Result> summarise(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() + twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }

    /**
     * Обработчик запроса на умножение двух чисел
     *
     * @param twoArgs аргументы
     * @return результат умножения двух чисел
     */
    @PostMapping("times")
    public ResponseEntity<Result> times(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() * twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }
}
