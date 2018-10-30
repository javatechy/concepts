# Event Driven: 

How to do request/reply processing within an event-driven architecture:

Even though messaging is an asynchronous protocol, there are times when we need to wait for a response when using messaging and queues. This short architecture lesson will show you how to do this.

There is no standard for communication or transport mechanisms for microservices. In general,
microservices communicate with each other using widely adopted lightweight protocols, such as HTTP
and REST, or messaging protocols, such as JMS or AMQP. In specific cases, one might choose more
optimized communication protocols, such as Thrift, ZeroMQ, Protocol Buffers, or Avro.


HoneyComb as microservices:

In the real world, bees build a honeycomb by aligning hexagonal wax cells. They start small, using
different materials to build the cells. Construction is based on what is available at the time of building.
Repetitive cells form a pattern and result in a strong fabric structure. Each cell in the honeycomb is
independent but also integrated with other cells. By adding new cells, the honeycomb grows organically
to a big, solid structure. The content inside each cell is abstracted and not visible outside. Damage to one
cell does not damage other cells, and bees can reconstruct these cells without impacting the overall
honeycomb.

Properties:  Autonomus(packaged as a single unit) and Single resopnsibllity.

Characterstics:


