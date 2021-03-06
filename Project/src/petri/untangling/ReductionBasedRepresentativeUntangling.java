package org.jbpt.petri.untangling;

import org.jbpt.petri.Flow;
import org.jbpt.petri.INetSystem;
import org.jbpt.petri.Marking;
import org.jbpt.petri.Node;
import org.jbpt.petri.Place;
import org.jbpt.petri.Transition;
import org.jbpt.petri.unfolding.BPNode;
import org.jbpt.petri.unfolding.Condition;
import org.jbpt.petri.unfolding.Event;

/**
 * An implementation of the reduction-based algorithm for computing representative untanglings of net systems ({@link INetSystem}).
 * 
 * @author Artem Polyvyanyy
 */
public class ReductionBasedRepresentativeUntangling
		extends AbstractReductionBasedRepresentativeUntangling<BPNode,Condition,Event,Flow,Node,Place,Transition,Marking> {

	public ReductionBasedRepresentativeUntangling(INetSystem<Flow,Node,Place,Transition,Marking> sys, UntanglingSetup setup) {
		super(sys, setup);
	}

	public ReductionBasedRepresentativeUntangling(INetSystem<Flow,Node,Place,Transition,Marking> sys) {
		super(sys);
	}

}
