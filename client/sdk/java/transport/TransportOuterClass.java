// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/transport.proto

package transport;

public final class TransportOuterClass {
  private TransportOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transport.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */
    int getHeaderCount();
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */
    boolean containsHeader(
        java.lang.String key);
    /**
     * Use {@link #getHeaderMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String>
    getHeader();
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */
    java.util.Map<java.lang.String, java.lang.String>
    getHeaderMap();
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */

    java.lang.String getHeaderOrDefault(
        java.lang.String key,
        java.lang.String defaultValue);
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */

    java.lang.String getHeaderOrThrow(
        java.lang.String key);

    /**
     * <code>bytes body = 2;</code>
     */
    com.google.protobuf.ByteString getBody();
  }
  /**
   * Protobuf type {@code transport.Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:transport.Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      body_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                header_ = com.google.protobuf.MapField.newMapField(
                    HeaderDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              header__ = input.readMessage(
                  HeaderDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              header_.getMutableMap().put(
                  header__.getKey(), header__.getValue());
              break;
            }
            case 18: {

              body_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return transport.TransportOuterClass.internal_static_transport_Message_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetHeader();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return transport.TransportOuterClass.internal_static_transport_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              transport.TransportOuterClass.Message.class, transport.TransportOuterClass.Message.Builder.class);
    }

    private int bitField0_;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static final class HeaderDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.String> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.String>newDefaultInstance(
                  transport.TransportOuterClass.internal_static_transport_Message_HeaderEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> header_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetHeader() {
      if (header_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HeaderDefaultEntryHolder.defaultEntry);
      }
      return header_;
    }

    public int getHeaderCount() {
      return internalGetHeader().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */

    public boolean containsHeader(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetHeader().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHeaderMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getHeader() {
      return getHeaderMap();
    }
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
      return internalGetHeader().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */

    public java.lang.String getHeaderOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeader().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; header = 1;</code>
     */

    public java.lang.String getHeaderOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeader().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int BODY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString body_;
    /**
     * <code>bytes body = 2;</code>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .serializeStringMapTo(
          output,
          internalGetHeader(),
          HeaderDefaultEntryHolder.defaultEntry,
          1);
      if (!body_.isEmpty()) {
        output.writeBytes(2, body_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
           : internalGetHeader().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
        header__ = HeaderDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, header__);
      }
      if (!body_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, body_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof transport.TransportOuterClass.Message)) {
        return super.equals(obj);
      }
      transport.TransportOuterClass.Message other = (transport.TransportOuterClass.Message) obj;

      boolean result = true;
      result = result && internalGetHeader().equals(
          other.internalGetHeader());
      result = result && getBody()
          .equals(other.getBody());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (!internalGetHeader().getMap().isEmpty()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + internalGetHeader().hashCode();
      }
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static transport.TransportOuterClass.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static transport.TransportOuterClass.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static transport.TransportOuterClass.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static transport.TransportOuterClass.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static transport.TransportOuterClass.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static transport.TransportOuterClass.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static transport.TransportOuterClass.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static transport.TransportOuterClass.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static transport.TransportOuterClass.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static transport.TransportOuterClass.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static transport.TransportOuterClass.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static transport.TransportOuterClass.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(transport.TransportOuterClass.Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code transport.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:transport.Message)
        transport.TransportOuterClass.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return transport.TransportOuterClass.internal_static_transport_Message_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetHeader();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableHeader();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return transport.TransportOuterClass.internal_static_transport_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                transport.TransportOuterClass.Message.class, transport.TransportOuterClass.Message.Builder.class);
      }

      // Construct using transport.TransportOuterClass.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableHeader().clear();
        body_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return transport.TransportOuterClass.internal_static_transport_Message_descriptor;
      }

      @java.lang.Override
      public transport.TransportOuterClass.Message getDefaultInstanceForType() {
        return transport.TransportOuterClass.Message.getDefaultInstance();
      }

      @java.lang.Override
      public transport.TransportOuterClass.Message build() {
        transport.TransportOuterClass.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public transport.TransportOuterClass.Message buildPartial() {
        transport.TransportOuterClass.Message result = new transport.TransportOuterClass.Message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.header_ = internalGetHeader();
        result.header_.makeImmutable();
        result.body_ = body_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof transport.TransportOuterClass.Message) {
          return mergeFrom((transport.TransportOuterClass.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(transport.TransportOuterClass.Message other) {
        if (other == transport.TransportOuterClass.Message.getDefaultInstance()) return this;
        internalGetMutableHeader().mergeFrom(
            other.internalGetHeader());
        if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
          setBody(other.getBody());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        transport.TransportOuterClass.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (transport.TransportOuterClass.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.String, java.lang.String> header_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetHeader() {
        if (header_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              HeaderDefaultEntryHolder.defaultEntry);
        }
        return header_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetMutableHeader() {
        onChanged();;
        if (header_ == null) {
          header_ = com.google.protobuf.MapField.newMapField(
              HeaderDefaultEntryHolder.defaultEntry);
        }
        if (!header_.isMutable()) {
          header_ = header_.copy();
        }
        return header_;
      }

      public int getHeaderCount() {
        return internalGetHeader().getMap().size();
      }
      /**
       * <code>map&lt;string, string&gt; header = 1;</code>
       */

      public boolean containsHeader(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetHeader().getMap().containsKey(key);
      }
      /**
       * Use {@link #getHeaderMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getHeader() {
        return getHeaderMap();
      }
      /**
       * <code>map&lt;string, string&gt; header = 1;</code>
       */

      public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
        return internalGetHeader().getMap();
      }
      /**
       * <code>map&lt;string, string&gt; header = 1;</code>
       */

      public java.lang.String getHeaderOrDefault(
          java.lang.String key,
          java.lang.String defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetHeader().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, string&gt; header = 1;</code>
       */

      public java.lang.String getHeaderOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetHeader().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearHeader() {
        internalGetMutableHeader().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; header = 1;</code>
       */

      public Builder removeHeader(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableHeader().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String>
      getMutableHeader() {
        return internalGetMutableHeader().getMutableMap();
      }
      /**
       * <code>map&lt;string, string&gt; header = 1;</code>
       */
      public Builder putHeader(
          java.lang.String key,
          java.lang.String value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableHeader().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; header = 1;</code>
       */

      public Builder putAllHeader(
          java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableHeader().getMutableMap()
            .putAll(values);
        return this;
      }

      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes body = 2;</code>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }
      /**
       * <code>bytes body = 2;</code>
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes body = 2;</code>
       */
      public Builder clearBody() {
        
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:transport.Message)
    }

    // @@protoc_insertion_point(class_scope:transport.Message)
    private static final transport.TransportOuterClass.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new transport.TransportOuterClass.Message();
    }

    public static transport.TransportOuterClass.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public transport.TransportOuterClass.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_transport_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_transport_Message_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_transport_Message_HeaderEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_transport_Message_HeaderEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031transport/transport.proto\022\ttransport\"v" +
      "\n\007Message\022.\n\006header\030\001 \003(\0132\036.transport.Me" +
      "ssage.HeaderEntry\022\014\n\004body\030\002 \001(\014\032-\n\013Heade" +
      "rEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\0012C" +
      "\n\tTransport\0226\n\006Stream\022\022.transport.Messag" +
      "e\032\022.transport.Message\"\000(\0010\001B5Z3github.co" +
      "m/micro/micro/v3/proto/transport;transpo" +
      "rtb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_transport_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_transport_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_transport_Message_descriptor,
        new java.lang.String[] { "Header", "Body", });
    internal_static_transport_Message_HeaderEntry_descriptor =
      internal_static_transport_Message_descriptor.getNestedTypes().get(0);
    internal_static_transport_Message_HeaderEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_transport_Message_HeaderEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
