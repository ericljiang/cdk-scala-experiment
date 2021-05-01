package com.myorg;

import software.amazon.awscdk.App;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.scalatest.flatspec.AnyFlatSpec
import com.fasterxml.jackson.databind.JsonNode

class CdkScalaExperimentTest extends AnyFlatSpec {

  private val JSON = new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true)

  "A CdkScalaExperimentApp" should "contain no resources" in {
    val app = new App
    val stack = new CdkScalaExperimentStack(app, "test")
    val actual: JsonNode = JSON.valueToTree(app.synth.getStackArtifact(stack.getArtifactId).getTemplate)
    // TODO compare against a checked-in JSON file https://github.com/aws/aws-cdk/pull/14444
    assert(actual.get("Resources") === null)
  }
}
