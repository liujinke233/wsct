
package helloworld;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the helloworld package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Str_QNAME = new QName("http://publishServlet/", "str");
    private final static QName _HelloResponse_QNAME = new QName("http://publishServlet/", "helloResponse");
    private final static QName _GetBean_QNAME = new QName("http://publishServlet/", "getBean");
    private final static QName _Hello_QNAME = new QName("http://publishServlet/", "hello");
    private final static QName _Box_QNAME = new QName("http://publishServlet/", "box");
    private final static QName _GetBeanResponse_QNAME = new QName("http://publishServlet/", "getBeanResponse");
    private final static QName _StrResponse_QNAME = new QName("http://publishServlet/", "strResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: helloworld
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Str }
     * 
     */
    public Str createStr() {
        return new Str();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public Box createBox() {
        return new Box();
    }

    /**
     * Create an instance of {@link GetBean }
     * 
     */
    public GetBean createGetBean() {
        return new GetBean();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetBeanResponse }
     * 
     */
    public GetBeanResponse createGetBeanResponse() {
        return new GetBeanResponse();
    }

    /**
     * Create an instance of {@link StrResponse }
     * 
     */
    public StrResponse createStrResponse() {
        return new StrResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Str }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publishServlet/", name = "str")
    public JAXBElement<Str> createStr(Str value) {
        return new JAXBElement<Str>(_Str_QNAME, Str.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publishServlet/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publishServlet/", name = "getBean")
    public JAXBElement<GetBean> createGetBean(GetBean value) {
        return new JAXBElement<GetBean>(_GetBean_QNAME, GetBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publishServlet/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Box }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publishServlet/", name = "box")
    public JAXBElement<Box> createBox(Box value) {
        return new JAXBElement<Box>(_Box_QNAME, Box.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publishServlet/", name = "getBeanResponse")
    public JAXBElement<GetBeanResponse> createGetBeanResponse(GetBeanResponse value) {
        return new JAXBElement<GetBeanResponse>(_GetBeanResponse_QNAME, GetBeanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publishServlet/", name = "strResponse")
    public JAXBElement<StrResponse> createStrResponse(StrResponse value) {
        return new JAXBElement<StrResponse>(_StrResponse_QNAME, StrResponse.class, null, value);
    }

}
