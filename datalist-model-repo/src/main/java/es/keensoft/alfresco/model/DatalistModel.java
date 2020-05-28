package es.keensoft.alfresco.model;

import org.alfresco.service.namespace.QName;

public class DatalistModel {

	private String nameSpaceUri;
	private String dataListType;
	private String codePropToUse;
	private String valuePropToUse;

	public DatalistModel(String nameSpaceUri, String dataListType, String codePropToUse, String valuePropToUse) {
		this.nameSpaceUri = nameSpaceUri;
		this.dataListType = dataListType;
		this.codePropToUse = codePropToUse;
		this.valuePropToUse = valuePropToUse;
	}

	public QName getCodePropToUse() {
		return QName.createQName(nameSpaceUri, codePropToUse);
	}

	public QName getDataListType() {
		return QName.createQName(nameSpaceUri, dataListType);
	}

	public QName getValuePropToUse() {
		return QName.createQName(nameSpaceUri, valuePropToUse);
	}

	public enum DataListStatus {
	    ADD, REPLACE, NONE
	}
	
}
