package board;

import assembler.Assembler;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.SVGPath;
import units.*;
import utils.MipsUtils;

public class Processor {
    @FXML SVGPath Jump;
    BooleanProperty JumpWire=new SimpleBooleanProperty();
    @FXML SVGPath BNE;
    BooleanProperty BNEWire=new SimpleBooleanProperty();
    @FXML SVGPath BEQ;
    BooleanProperty BEQWire=new SimpleBooleanProperty();
    @FXML SVGPath MemToReg;
    BooleanProperty MemToRegWire=new SimpleBooleanProperty();
    @FXML SVGPath MemData;
    BooleanProperty MemDataWire=new SimpleBooleanProperty();
    @FXML SVGPath MemWrite;
    BooleanProperty MemWriteWire=new SimpleBooleanProperty();
    @FXML SVGPath ALUSrc;
    BooleanProperty ALUSrcWire=new SimpleBooleanProperty();
    @FXML SVGPath Unsigned;
    BooleanProperty UnsignedWire=new SimpleBooleanProperty();
    @FXML SVGPath RegDst;
    BooleanProperty RegDstWire=new SimpleBooleanProperty();
    @FXML SVGPath LUI;
    BooleanProperty LUIWire=new SimpleBooleanProperty();
    @FXML SVGPath MemRead;
    BooleanProperty MemReadWire=new SimpleBooleanProperty();
    @FXML SVGPath ALUOp;
    BooleanProperty ALUOpWire=new SimpleBooleanProperty();
    @FXML SVGPath RegWrite;
    BooleanProperty RegWriteWire=new SimpleBooleanProperty();
    @FXML SVGPath PCInput;
    BooleanProperty PCInputWire=new SimpleBooleanProperty();
    @FXML SVGPath PCMuxInput;
    BooleanProperty PCMuxInputWire=new SimpleBooleanProperty();
    @FXML SVGPath PCAdderOutput;
    BooleanProperty PCAdderOutputWire=new SimpleBooleanProperty();
    @FXML SVGPath PCShifterOutput;
    BooleanProperty RPCShifterOutputWire=new SimpleBooleanProperty();
    @FXML SVGPath PCMuxInput1;
    BooleanProperty PCMuxInput1Wire=new SimpleBooleanProperty();
    @FXML SVGPath BranchMuxSelector;
    BooleanProperty BranchMuxSelectorWire=new SimpleBooleanProperty();
    @FXML SVGPath BranchOrInput1;
    BooleanProperty BranchOrInput1Wire=new SimpleBooleanProperty();
    @FXML SVGPath BranchOrInput2;
    BooleanProperty BranchOrInput2Wire=new SimpleBooleanProperty();
    @FXML SVGPath Adder4;
    BooleanProperty Adder4Wire=new SimpleBooleanProperty();
    @FXML SVGPath ALUInput2;
    BooleanProperty ALUInput2Wire=new SimpleBooleanProperty();
    @FXML SVGPath WriteReg;
    BooleanProperty WriteRegWire=new SimpleBooleanProperty();
    @FXML SVGPath RegWriteAndOutput;
    BooleanProperty RegWriteAndOutputWire=new SimpleBooleanProperty();
    @FXML SVGPath MemExtenderOutput;
    BooleanProperty MemExtenderOutputWire=new SimpleBooleanProperty();
    @FXML SVGPath MemReadData;
    BooleanProperty MemReadDataWire=new SimpleBooleanProperty();
    @FXML SVGPath Shamt;
    BooleanProperty ShamtWire=new SimpleBooleanProperty();
    @FXML SVGPath ALUControlOp;
    BooleanProperty ALUControlOpWire=new SimpleBooleanProperty();
    @FXML SVGPath RegReadData2;
    BooleanProperty RegReadData2Wire=new SimpleBooleanProperty();
    @FXML SVGPath ALUZero;
    BooleanProperty ALUZeroWire=new SimpleBooleanProperty();
    @FXML SVGPath MemMux1Output;
    BooleanProperty MemMux1OutputWire=new SimpleBooleanProperty();
    @FXML SVGPath RegWriteData;
    BooleanProperty RegWriteDataWire=new SimpleBooleanProperty();
    @FXML SVGPath ALUOutput;
    BooleanProperty ALUOutputWire=new SimpleBooleanProperty();
    @FXML SVGPath PCOutput;
    BooleanProperty PCOutputWire=new SimpleBooleanProperty();
    @FXML SVGPath JR;
    BooleanProperty JRWire=new SimpleBooleanProperty();
    @FXML SVGPath PCShifterInput;
    BooleanProperty PCShifterInputWire=new SimpleBooleanProperty();
    @FXML SVGPath BranchShifterInput;
    BooleanProperty BranchShifterInputWire=new SimpleBooleanProperty();
    @FXML SVGPath BranchAdderInput2;
    BooleanProperty BranchAdderInput2Wire=new SimpleBooleanProperty();
    @FXML SVGPath BranchMux1Output;
    BooleanProperty BranchMux1OutputWire=new SimpleBooleanProperty();
    @FXML SVGPath BranchAdderOutput;
    BooleanProperty BranchAdderOutputWire=new SimpleBooleanProperty();
    @FXML SVGPath Mux16;
    BooleanProperty Mux16Wire=new SimpleBooleanProperty();
    @FXML Label MemDataString;
    StringProperty MemDataStringWire=new SimpleStringProperty();
    @FXML Label ALUOpString;
    StringProperty ALUOpStringWire=new SimpleStringProperty();
    @FXML Label RegDstString;
    StringProperty RegDstStringWire=new SimpleStringProperty();
    @FXML Label InstructionRs;
    StringProperty InstructionRsWire=new SimpleStringProperty();
    @FXML Label InstructionRt;
    StringProperty InstructionRtWire=new SimpleStringProperty();
    @FXML Label InstructionRd;
    StringProperty InstructionRdWire=new SimpleStringProperty();
    @FXML Label InstructionConst;
    StringProperty InstructionConstWire=new SimpleStringProperty();
    @FXML Label InstructionShamt;
    StringProperty InstructionShamtWire=new SimpleStringProperty();
    @FXML Label InstructionOp;
    StringProperty InstructionOpWire=new SimpleStringProperty();
    @FXML Label PCInputString;
    StringProperty PCInputStringWire=new SimpleStringProperty();
    @FXML Label PCOutputString;
    StringProperty PCOutputStringWire=new SimpleStringProperty();
    @FXML Label PCMuxIn1;
    StringProperty PCMuxIn1Wire=new SimpleStringProperty();
    @FXML Label PCMuxIn0;
    StringProperty PCMuxIn0Wire=new SimpleStringProperty();
    @FXML Label InstructionShift;
    StringProperty InstructionShiftWire=new SimpleStringProperty();
    @FXML Label JumpAddress;
    StringProperty JumpAddressWire=new SimpleStringProperty();
    @FXML Label PCAdderOut;
    StringProperty PCAdderOutWire=new SimpleStringProperty();
    @FXML Label BranchAdderOut;
    StringProperty BranchAdderOutWire=new SimpleStringProperty();
    @FXML Label BranchMux1Out;
    StringProperty BranchMux10Wire=new SimpleStringProperty();
    @FXML Label BranchShifterIn;
    StringProperty BranchShifterInWire=new SimpleStringProperty();
    @FXML Label BranchShifterOut;
    StringProperty BranchShifterOutWire=new SimpleStringProperty();
    @FXML Label ALUControllerOut;
    StringProperty ALUControllerOutWire=new SimpleStringProperty();
    @FXML Label ShamtString;
    StringProperty ShamtStringWire=new SimpleStringProperty();
    @FXML Label ALUResult;
    StringProperty ALUResultWire=new SimpleStringProperty();
    @FXML Label ALUIn1;
    StringProperty ALUIn1Wire=new SimpleStringProperty();
    @FXML Label ALUIn2;
    StringProperty ALUIn2Wire=new SimpleStringProperty();
    @FXML Label ExtenderOut;
    StringProperty ExtenderOutWire=new SimpleStringProperty();
    @FXML Label ExtenderMemOut;
    StringProperty ExtenderMemOutWire=new SimpleStringProperty();
    @FXML Label ReadDataReg1;
    StringProperty ReadDataReg1Wire=new SimpleStringProperty();
    @FXML Label ReadDataReg2;
    StringProperty ReadDataReg2Wire=new SimpleStringProperty();
    @FXML Label WriteDataReg;
    StringProperty WriteDataRegWire=new SimpleStringProperty();
    @FXML Label WriteDataMem;
    StringProperty WriteDataMemWire=new SimpleStringProperty();
    @FXML Label ReadDataMem;
    StringProperty ReadDataMemWire=new SimpleStringProperty();
    @FXML Label MemMux1Out;
    StringProperty MemMux1OutWire=new SimpleStringProperty();
    @FXML Label PCAdderOutt;
    StringProperty PCAdderOuttWire=new SimpleStringProperty();
    @FXML Label InstructionFn;
    StringProperty InstructionFnWire=new SimpleStringProperty();

    //units
    private Assembler Assembler=new Assembler();
    private Controller Controller=new Controller();
    private ALUController ALUController=new ALUController();
    private Mux ALUMux=new Mux();
    private Mux ShamtMux=new Mux();
    private ALU ALU=new ALU();
    private Adder PCAdder= new Adder();




    public void process(){
        //fetch();
        //decode();
        excute();
        //toMemory();
        //writeBack();
        setPC();
    }

    private void excute(){
        //ALUController
        ALUOpStringWire.setValue(MipsUtils.fromBooleantoString(Controller.getAluOp()));
        ALUController.setInputs(Controller.getAluOp(),MipsUtils.fromStringtoBoolean(InstructionFnWire.getValue()));
        ALUControllerOutWire.setValue(MipsUtils.fromBooleantoString(ALUController.getOp()));

        //ALUMux
        ALUMux.set2Inputs(ReadDataReg2Wire.getValue(),ExtenderOutWire.getValue(),ALUSrcWire.getValue().booleanValue());
        ALUIn2Wire.setValue(ALUMux.getOutput());

        //ShamtMux
        ShamtMux.set2Inputs("00000000000000000000000000010000",InstructionShamtWire.getValue(),LUIWire.getValue().booleanValue());
        ShamtStringWire.setValue(ShamtMux.getOutput());

        //ALU
        ALUIn1Wire=ReadDataReg1Wire;
        ALU.setInputs(ALUControllerOutWire.getValue(),ALUIn1Wire.getValue(),ALUIn2Wire.getValue(),ShamtStringWire.getValue());
        ALUZeroWire.setValue((Boolean)ALU.getZeroFlag());
        ALUResultWire.setValue(ALU.getOutput());
    }

    private void setPC(){
        //Adder
    }
}

