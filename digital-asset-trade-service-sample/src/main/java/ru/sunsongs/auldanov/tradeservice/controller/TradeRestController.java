package ru.sunsongs.auldanov.tradeservice.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sunsongs.auldanov.tradeservice.dao.entity.BuyOrder;
import ru.sunsongs.auldanov.tradeservice.dao.entity.Execution;
import ru.sunsongs.auldanov.tradeservice.dao.entity.SellOrder;
import ru.sunsongs.auldanov.tradeservice.model.OrderData;
import ru.sunsongs.auldanov.tradeservice.service.ExecutionService;

import javax.annotation.concurrent.ThreadSafe;
import javax.validation.Valid;
import java.util.List;

import static java.util.Objects.requireNonNull;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author kraken
 */
@ThreadSafe
@RestController
public class TradeRestController {
    private final ExecutionService executionService;

    @Autowired
    public TradeRestController(ExecutionService executionService) {
        this.executionService = requireNonNull(executionService);
    }

//    @RequestMapping(value = "/api/sell", methodod = POST)
    @ResponseStatus(OK)
    @RequestMapping(value = "/api/sell", method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST", value = "Response a string describing if the /api/sell is successfully created or not.", notes = "e.g. quantity: 1L,price: 10")
    public void sell(@RequestBody @Valid OrderData sellRequest) {
        executionService.sell(sellRequest);
    }

//    @RequestMapping(value = "/api/buy", method = POST)
    @ResponseStatus(OK)
    @RequestMapping(value = "/api/buy", method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST", value = "Response a string describing if the /api/buy is successfully created or not.", notes = "e.g. quantity: 1L,price: 10")
    public void buy(@RequestBody @Valid OrderData buyRequest) {
        executionService.buy(buyRequest);
    }

    @RequestMapping(value = "/api/order/waiting/sell", method = GET)
    public List<SellOrder> waitingSellOrders() {
        return executionService.waitingSellOrders();
    }

    @RequestMapping(value = "/api/order/waiting/buy", method = GET)
    public List<BuyOrder> waitingBuyOrders() {
        return executionService.waitingBuyOrders();
    }

    @RequestMapping(value = "/api/order/executed", method = GET)
    public List<Execution> executedOrders(@RequestParam(defaultValue = "10") int count) {
        return executionService.executedOrders(count);
    }

    @RequestMapping(value = "/api/order/executed/last", method = GET)
    public Execution lastExecution() {
        return executionService.lastExecution();
    }
}