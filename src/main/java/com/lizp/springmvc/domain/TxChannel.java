package com.lizp.springmvc.domain;

import java.io.Serializable;
import java.util.Date;

public class TxChannel implements Serializable {

	private static final long serialVersionUID = 6306570038243545753L;

	/**
	 * 系统跟踪号，统一接入生成，贯穿交易
	 */
	private String globalSeq;

	/**
	 * 渠道交易流水号
	 */
	private String channelSerialNo;

	/**
	 * 渠道交易时间
	 */
	private Date channelTxTime;

	/**
	 * 渠道交易类型：见数据字典
	 */
	private String channelTradeType;

	/**
	 * 交易金额：分为单位
	 */
	private Integer txAmount;

	/**
	 * 交易状态：1-成功 2-失败 3-处理中 9-取消
	 */
	private String txStatus;

	/**
	 * 原渠道交易流水号：退款类交易必填
	 */
	private String orgChannelSerialNo;

	/**
	 * 支付流水号
	 */
	private String paySerialNo;

	/**
	 * 支付用户编号
	 */
	private String custId;

	/**
	 * 银行联行号：代付类交易使用
	 */
	private String bankBranchId;

	/**
	 * 渠道编号
	 */
	private String channelId;

	/**
	 * 渠道商户号
	 */
	private String channelMerId;

	/**
	 * 前置分组：银行前置group
	 */
	private String channelGroup;

	/**
	 * 外部渠道交易流水号：渠道返回的查询流水号
	 */
	private String outSerialNo;

	/**
	 * 外部渠道交易结束时间
	 */
	private Date outTxEndTime;

	/**
	 * 外部渠道交易清算日期
	 */
	private String outSettleDate;

	/**
	 * 外部渠道返回码
	 */
	private String outRespCode;

	/**
	 * 外部渠道返回描述
	 */
	private String outRespDesc;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	private Date gmtModified;

	/**
	 * 获取 [TX_CHANNEL] 的属性 渠道交易流水号
	 */
	public String getChannelSerialNo() {
		return channelSerialNo;
	}

	/**
	 * 设置[TX_CHANNEL]的属性渠道交易流水号
	 */
	public void setChannelSerialNo(String channelSerialNo) {
		this.channelSerialNo = channelSerialNo == null ? null : channelSerialNo.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 渠道交易时间
	 */
	public Date getChannelTxTime() {
		return channelTxTime;
	}

	/**
	 * 设置[TX_CHANNEL]的属性渠道交易时间
	 */
	public void setChannelTxTime(Date channelTxTime) {
		this.channelTxTime = channelTxTime;
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 渠道交易类型：见数据字典
	 */
	public String getChannelTradeType() {
		return channelTradeType;
	}

	/**
	 * 设置[TX_CHANNEL]的属性渠道交易类型：见数据字典
	 */
	public void setChannelTradeType(String channelTradeType) {
		this.channelTradeType = channelTradeType == null ? null : channelTradeType.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 交易金额：分为单位
	 */
	public Integer getTxAmount() {
		return txAmount;
	}

	/**
	 * 设置[TX_CHANNEL]的属性交易金额：分为单位
	 */
	public void setTxAmount(Integer txAmount) {
		this.txAmount = txAmount;
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 交易状态：1-成功 2-失败 3-处理中 9-取消
	 */
	public String getTxStatus() {
		return txStatus;
	}

	/**
	 * 设置[TX_CHANNEL]的属性交易状态：1-成功 2-失败 3-处理中 9-取消
	 */
	public void setTxStatus(String txStatus) {
		this.txStatus = txStatus == null ? null : txStatus.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 原渠道交易流水号：退款类交易必填
	 */
	public String getOrgChannelSerialNo() {
		return orgChannelSerialNo;
	}

	/**
	 * 设置[TX_CHANNEL]的属性原渠道交易流水号：退款类交易必填
	 */
	public void setOrgChannelSerialNo(String orgChannelSerialNo) {
		this.orgChannelSerialNo = orgChannelSerialNo == null ? null : orgChannelSerialNo.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 支付流水号
	 */
	public String getPaySerialNo() {
		return paySerialNo;
	}

	/**
	 * 设置[TX_CHANNEL]的属性支付流水号
	 */
	public void setPaySerialNo(String paySerialNo) {
		this.paySerialNo = paySerialNo == null ? null : paySerialNo.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 系统跟踪号，统一接入生成，贯穿交易
	 */
	public String getGlobalSeq() {
		return globalSeq;
	}

	/**
	 * 设置[TX_CHANNEL]的属性系统跟踪号，统一接入生成，贯穿交易
	 */
	public void setGlobalSeq(String globalSeq) {
		this.globalSeq = globalSeq == null ? null : globalSeq.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 支付用户编号
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * 设置[TX_CHANNEL]的属性支付用户编号
	 */
	public void setCustId(String custId) {
		this.custId = custId == null ? null : custId.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 银行联行号：代付类交易使用
	 */
	public String getBankBranchId() {
		return bankBranchId;
	}

	/**
	 * 设置[TX_CHANNEL]的属性银行联行号：代付类交易使用
	 */
	public void setBankBranchId(String bankBranchId) {
		this.bankBranchId = bankBranchId == null ? null : bankBranchId.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 渠道编号
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * 设置[TX_CHANNEL]的属性渠道编号
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId == null ? null : channelId.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 渠道商户号
	 */
	public String getChannelMerId() {
		return channelMerId;
	}

	/**
	 * 设置[TX_CHANNEL]的属性渠道商户号
	 */
	public void setChannelMerId(String channelMerId) {
		this.channelMerId = channelMerId == null ? null : channelMerId.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 前置分组：银行前置group
	 */
	public String getChannelGroup() {
		return channelGroup;
	}

	/**
	 * 设置[TX_CHANNEL]的属性前置分组：银行前置group
	 */
	public void setChannelGroup(String channelGroup) {
		this.channelGroup = channelGroup == null ? null : channelGroup.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 外部渠道交易流水号：渠道返回的查询流水号
	 */
	public String getOutSerialNo() {
		return outSerialNo;
	}

	/**
	 * 设置[TX_CHANNEL]的属性外部渠道交易流水号：渠道返回的查询流水号
	 */
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo == null ? null : outSerialNo.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 外部渠道交易结束时间
	 */
	public Date getOutTxEndTime() {
		return outTxEndTime;
	}

	/**
	 * 设置[TX_CHANNEL]的属性外部渠道交易结束时间
	 */
	public void setOutTxEndTime(Date outTxEndTime) {
		this.outTxEndTime = outTxEndTime;
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 外部渠道交易清算日期
	 */
	public String getOutSettleDate() {
		return outSettleDate;
	}

	/**
	 * 设置[TX_CHANNEL]的属性外部渠道交易清算日期
	 */
	public void setOutSettleDate(String outSettleDate) {
		this.outSettleDate = outSettleDate == null ? null : outSettleDate.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 外部渠道返回码
	 */
	public String getOutRespCode() {
		return outRespCode;
	}

	/**
	 * 设置[TX_CHANNEL]的属性外部渠道返回码
	 */
	public void setOutRespCode(String outRespCode) {
		this.outRespCode = outRespCode == null ? null : outRespCode.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 外部渠道返回描述
	 */
	public String getOutRespDesc() {
		return outRespDesc;
	}

	/**
	 * 设置[TX_CHANNEL]的属性外部渠道返回描述
	 */
	public void setOutRespDesc(String outRespDesc) {
		this.outRespDesc = outRespDesc == null ? null : outRespDesc.trim();
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 创建时间
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * 设置[TX_CHANNEL]的属性创建时间
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * 获取 [TX_CHANNEL] 的属性 更新时间
	 */
	public Date getGmtModified() {
		return gmtModified;
	}

	/**
	 * 设置[TX_CHANNEL]的属性更新时间
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return String.format(
				"TxChannel [globalSeq=%s, channelSerialNo=%s, channelTxTime=%s, channelTradeType=%s, txAmount=%s, txStatus=%s, orgChannelSerialNo=%s, paySerialNo=%s, custId=%s, bankBranchId=%s, channelId=%s, channelMerId=%s, channelGroup=%s, outSerialNo=%s, outTxEndTime=%s, outSettleDate=%s, outRespCode=%s, outRespDesc=%s, gmtCreate=%s, gmtModified=%s]",
				globalSeq, channelSerialNo, channelTxTime, channelTradeType, txAmount, txStatus, orgChannelSerialNo,
				paySerialNo, custId, bankBranchId, channelId, channelMerId, channelGroup, outSerialNo, outTxEndTime,
				outSettleDate, outRespCode, outRespDesc, gmtCreate, gmtModified);
	}

}