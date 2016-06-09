/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class GetTablesResp implements Externalizable, Message<GetTablesResp>, Schema<GetTablesResp>
{

    public static Schema<GetTablesResp> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static GetTablesResp getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final GetTablesResp DEFAULT_INSTANCE = new GetTablesResp();

    
    private RequestStatus status;
    private List<TableMetadata> tables;
    private DrillPBError error;

    public GetTablesResp()
    {
        
    }

    // getters and setters

    // status

    public RequestStatus getStatus()
    {
        return status == null ? RequestStatus.UNKNOWN : status;
    }

    public GetTablesResp setStatus(RequestStatus status)
    {
        this.status = status;
        return this;
    }

    // tables

    public List<TableMetadata> getTablesList()
    {
        return tables;
    }

    public GetTablesResp setTablesList(List<TableMetadata> tables)
    {
        this.tables = tables;
        return this;
    }

    // error

    public DrillPBError getError()
    {
        return error;
    }

    public GetTablesResp setError(DrillPBError error)
    {
        this.error = error;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<GetTablesResp> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public GetTablesResp newMessage()
    {
        return new GetTablesResp();
    }

    public Class<GetTablesResp> typeClass()
    {
        return GetTablesResp.class;
    }

    public String messageName()
    {
        return GetTablesResp.class.getSimpleName();
    }

    public String messageFullName()
    {
        return GetTablesResp.class.getName();
    }

    public boolean isInitialized(GetTablesResp message)
    {
        return true;
    }

    public void mergeFrom(Input input, GetTablesResp message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.status = RequestStatus.valueOf(input.readEnum());
                    break;
                case 2:
                    if(message.tables == null)
                        message.tables = new ArrayList<TableMetadata>();
                    message.tables.add(input.mergeObject(null, TableMetadata.getSchema()));
                    break;

                case 3:
                    message.error = input.mergeObject(message.error, DrillPBError.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, GetTablesResp message) throws IOException
    {
        if(message.status != null)
             output.writeEnum(1, message.status.number, false);

        if(message.tables != null)
        {
            for(TableMetadata tables : message.tables)
            {
                if(tables != null)
                    output.writeObject(2, tables, TableMetadata.getSchema(), true);
            }
        }


        if(message.error != null)
             output.writeObject(3, message.error, DrillPBError.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "status";
            case 2: return "tables";
            case 3: return "error";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("status", 1);
        __fieldMap.put("tables", 2);
        __fieldMap.put("error", 3);
    }
    
}
