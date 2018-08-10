package com.lizp.springmvc.service;

import com.lizp.springmvc.domain.TxChannel;

public interface ITxChannelService {
	/**
	 * @param channelSerialNo
	 * @param custId
	 * @return
	 */
	TxChannel selectById(String channelSerialNo, String custId);

	/**
	 * @param paySerialNo
	 * @param custId
	 * @return
	 */
	TxChannel selectByPaySerialNo(String paySerialNo, String custId);

	/**
	 * @param txChannel
	 * @return
	 */
	int insertSelective(TxChannel txChannel);

	/**
	 * @param txChannel
	 * @return
	 */
	int updateById(TxChannel txChannel);

}
