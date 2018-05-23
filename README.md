# IEXTrading4j FIX: Open source IEX Trading QuickFIX FIX dictionary

## Table of Contents

* [Quick Start](#quick-start)
* [Description](#description)
* [IEX Trading](#iex-trading)
* [Code Generation](#code-generation)
* [License](#license)
* [Others](#others)

## Quick Start

Java SE 8 is required to use IEXTrading4j library.

```
<dependency>
	<groupId>pl.zankowski</groupId>
	<artifactId>iextrading4j-fix</artifactId>
	<version>1.0.0</version>
</dependency>
```

Library is up to IEX Trading FIX specification version [2.67] - 23.05.2018 

## Description

IEXTrading4j FIX is an open source IEX Trading QuickFIX FIX dictionary. It will make it easier to connect to IEX FIX connection using QuickFIX libraries.

FIX specification: [IEX FIX Specification](https://iextrading.com/docs/IEX%20FIX%20Specification.pdf)

## IEX Trading

IEX A Fair, Simple, Transparent Exchange.

IEX is a stock exchange based in the United States. Started by Brad Katsuyama, it opened for trading on October 25, 2013. The company’s offices are located at 4 World Trade Center in New York City. The matching engine is located across the Hudson River in Weehawken, New Jersey, and the initial point of presence is located in a data center in Secaucus, New Jersey. IEX's main innovation is a 38-mile coil of optical fiber placed in front of its trading engine. This 350 microsecond delay adds a round-trip delay of 0.0007 seconds and is designed to negate the certain speed advantages utilized by some high-frequency traders.

IEX was created in response to questionable trading practices that had become widely used across traditional public Wall Street exchanges as well as dark pools and other alternative trading systems. The IEX exchange aims to attract investors by promising to "play fair" by operating in a transparent and straightforward manner, while also helping to level the playing field for traders. Strategies to achieve those goals include:

* Publishing the matching rules used in the exchanges's computerized order matching engine.
* Offering a limited number of simple and familiar order types.
* Charging fixed fees on most orders (or a flat percentage rate on small orders).
* Ensuring market pricing data arrives at external points of presence simultaneously.
* Slightly delaying market pricing data to all customers (no colocation).
* Refusing to pay for order flow.

Check out their beautiful site: [IEX Trading](https://iextrading.com/)

## Code Generation

### QuickFix/J

To generate code based on XML FIX Dictionary I recommend using maven plugin released by QuickFix/J. I did not find any useful documentation on how to use it, so quick tutorial down below.

In each POM file there is already configurated quickfixj-codegenerator plugin. To make it work just run it trough command line.

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-codegenerator</artifactId>
            <version>2.0.0</version>
            <configuration>
                <dictFile>${basedir}/src/main/resources/IB_FIX.xml</dictFile>
                <outputDirectory>${basedir}/src/main/java/</outputDirectory>
                <packaging>quickfix.ib</packaging>
                <fieldPackage>quickfix.ib.field</fieldPackage>
            </configuration>
        </plugin>
    </plugins>
</build>
```

Available configuration parameters:

* ```dictFile``` - The dictionary file to use for mapping messages to java.
* ```schemaDirectory``` - The source directory containing *.xsd files.
* ```outputDirectory``` - The directory to output the generated sources to.
* ```decimal``` - Enable BigDecimal representation.
* ```orderedFields``` - Enable orderedFields.
* ```packaging``` - The package for the generated source.
* ```fieldPackage``` - The base field class to use.

For more details about implementation, check out ```org.quickfixj.codegenerator.GenerateMojo``` class.

## License

Code and documentation released under the Apache License, Version 2.0

Data provided for free by [IEX](https://iextrading.com/developer).

IEX Trading API Exhibit A: [Exhibit A](https://iextrading.com/api-exhibit-a)

## Others

# [IEXTrading4j HIST](https://github.com/WojciechZankowski/iextrading4j-hist)

IEX Trading allows users to receive their market data completly for free. Their data can be accessed in real-time during market session or can be downloaded as recorded sessions in PCAP data format. Market Data is transported in binary format and can be read according to specification shared on their site.

This library allows you to transform binary packets into human readable Market Data events in Java.

More on this topic can found here: [IEX Trading Market Data](https://www.iextrading.com/trading/market-data/)

# [IEXTrading4j BOOK](https://github.com/WojciechZankowski/iextrading4j-book)

IEXTrading4j Book library allows to build incremental Order Book based on PriceLevelUpdateMessages from DEEP market data stream. OrderBook implementation follows description from specification.