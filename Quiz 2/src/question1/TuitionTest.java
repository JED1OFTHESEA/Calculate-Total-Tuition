package question1;

import static org.junit.Assert.*;

import javax.sound.midi.MidiChannel;

import org.junit.Test;

public class TuitionTest {

	@Test
	public void final_tuition_test() {
		double tuition_increase_test = .04;
		double init_tuition_test = 12450;
		double actual = 12948;
		assertTrue((tuition_increase_test*init_tuition_test)+init_tuition_test==actual);
		}
	public void payment_test(){
		double tt = 12450;
		double mi = .00375;
		double mpt = 360;
		double 
		assertTrue((tt*(Math.pow(1+mi, mpt))/(Math.pow(1+mi, mpt)-1)))==
	}
	}