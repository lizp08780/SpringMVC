package com.lizp.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lizp.springmvc.domain.TxChannel;
import com.lizp.springmvc.service.ITxChannelService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Api(value = "txChannel")
@Controller
@RequestMapping(value = "/txChannel")
public class TxChannelController {
	@Autowired
	private ITxChannelService txChannelService;

	@RequestMapping(value = "/getTxChannel")
	@ResponseBody
	@ApiOperation(value = "根据渠道交易流水号获取渠道流水", httpMethod = "GET", notes = "get txChannel by channelSerialNo", response = TxChannel.class)
	public TxChannel getTxChannel(
			@ApiParam(required = true, value = "渠道交易流水号", name = "channelSerialNo") @RequestParam(value = "channelSerialNo") String channelSerialNo) {
		return txChannelService.selectById(channelSerialNo, "u-test-667");
	}
}
